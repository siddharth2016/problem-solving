// IGNORE //

package src.may23circuit;

import java.util.Arrays;
import java.util.Scanner;

public class CountTuples2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test != 0) {
            int n = scan.nextInt(); scan.nextLine();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(countTuples(arr, n));
            test--;
        }
    }

    public static int lower(int a[], int x)	 //Returns leftest index of x in sorted arr else n
    {												 //If not present returns index of just greater element
        int n = a.length;
        int l = 0;
        int r = n - 1;
        int ans = n;
        while(l <= r)
        {
            int m = (r - l) / 2 + l;
            if(a[m] >= x)
            {
                ans = m;
                r = m - 1;
            }
            else
            {
                l = m + 1;
            }
        }
        return ans;
    }

    // Returns sum of arr[0..i]. This function
    // assumes that the array is preprocessed
    // and partial sums of array elements are
    // stored in BIT[].
    public static int query(int BIT[], int i)
    {
        int sum = 0;
        for (; i > 0; i -= (i & -i)) {
            sum += BIT[i];
        }
        return sum;
    }

    // Converts an array to an array with values from 1 to n
    // and relative order of smaller and greater elements
    // remains same. For example, {7, -90, 100, 1} is
    // converted to {3, 1, 4 ,2 }
    public static int[] Convert(int arr[], int n)
    {
        int temp[]=new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = lower(temp, arr[i]) + 1;
        }

        return result;
    }

    // Updates a node in Binary Index Tree (BIT)
    // at given index(i) in BIT. The given value
    // 'val' is added to BITree[i] and
    // all of its ancestors in tree.
    public static void update(int BIT[], int n, int i, int val)
    {
        for (; i <= n; i += (i & -i)) {
            BIT[i] += val;
        }
    }

    // Function to find triplets
    public static long countTuples(int arr[], int n)
    {
        int[] BIT1 = new int[n+1];
        int[] BIT2 = new int[n+1];
        int[] smaller_right = new int[n+1];
        int[] greater_left = new int[n+1];
        int[] smaller_left = new int[n+1];
        int[] greater_right = new int[n+1];

        for(int i=0;i<n+1;i++){
            BIT1[i]=0;
            BIT2[i]=0;
            smaller_right[i]=0;
            greater_left[i]=0;
            smaller_left[i]=0;
            greater_right[i]=0;
        }

        // Find all right side smaller elements
        for (int i = n - 1; i >= 0; i--) {
            smaller_right[i] = query(BIT1, arr[i]-1);
            update(BIT1, n, arr[i], 1);
        }

        for (int i = 0; i <= n; i++) {
            BIT1[i] = 0;
        }

        // Find all left side greater elements
        for (int i = 0; i < n; i++) {
            greater_left[i] = i - query(BIT1, arr[i]);
            update(BIT1, n, arr[i], 1);
        }

        // Find the required answer
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            ans += (long)greater_left[i] * smaller_right[i];
        }


        // Find all right side smaller elements
        for (int i = 0; i<n; i++) {
            smaller_left[i] = query(BIT2, arr[i]-1);
            update(BIT2, n, arr[i], 1);
        }

        for (int i = 0; i <= n; i++) {
            BIT2[i] = 0;
        }

        // Find all left side greater elements
        for (int i = n-1; i >= 0; i--) {
            greater_right[i] = i - query(BIT2, arr[i]);
            update(BIT2, n, arr[i], 1);
        }


        for (int i = 0; i < n; i++) {
            ans += (long)smaller_left[i] * greater_right[i];
        }

        // Return the required answer
        return ans;
    }
}
