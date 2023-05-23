package src.may23circuit;

// Input/Output for the test cases seems wrong

/*

Sample Test Case
1
3
5 5 5

Output -> 1
Expected Output (by online judge) -> -1

Count of tuples can never be negative, it should be at least 0

 */


import java.util.Scanner;

public class CountTuples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test != 0) {
            int n = scan.nextInt(); scan.nextLine();
            long[] arr = new long[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextLong();
            }
            System.out.println(countTuples(arr, n));
            test--;
        }
    }

    public static long countTuples(long[] arr, int n) {
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    if(Long.min(arr[i], arr[k]) <= arr[j] && arr[j] <= Long.max(arr[i], arr[k])) ans++;
                }
            }
        }
        return ans;
    }

    /*
    public static long countTuples(long[] arr, int n) {
        List<Long> leftSmaller = createLeftSmaller(arr, n);
        List<Long> rightLarger = createRightLarger(arr, n);
        List<Long> leftLarger = createLeftLarger(arr, n);
        List<Long> rightSmaller = createRightSmaller(arr, n);

        System.out.println(leftSmaller);
        System.out.println(rightSmaller);

        System.out.println(leftLarger);
        System.out.println(rightLarger);

        long ans = 0L;

        for(int i=0; i<n; i++) {
            ans += leftSmaller.get(i) * rightLarger.get(i) + rightSmaller.get(i) * leftLarger.get(i);
        }

        return ans;
    }

    public static List<Long> createRightSmaller(long[] arr, int n) {
        List<Long> ans = new ArrayList<>();
        List<Long> temp = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int c = Collections.binarySearch(temp, arr[i], (a, b) -> {
                if(a <= b) return -1;
                else return 1;
            });
            if (c < 0) c = -c - 1;
            ans.add((long)c);
            temp.add(c, arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static List<Long> createLeftLarger(long[] arr, int n) {
        List<Long> ans = new ArrayList<>();
        List<Long> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = Collections.binarySearch(temp, arr[i], Collections.reverseOrder());
            if (c < 0) c = -c - 1;
            ans.add((long)c);
            temp.add(c, arr[i]);
        }
        return ans;
    }

    public static List<Long> createRightLarger(long[] arr, int n) {
        List<Long> ans = new ArrayList<>();
        List<Long> temp = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int c = Collections.binarySearch(temp, arr[i], Collections.reverseOrder());
            if (c < 0) c = -c - 1;
            ans.add((long)c);
            temp.add(c, arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static List<Long> createLeftSmaller(long[] arr, int n) {
        List<Long> ans = new ArrayList<>();
        List<Long> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = Collections.binarySearch(temp, arr[i], (a,b) -> {
                if(a <= b) return -1;
                return 1;
            });
            if (c < 0) c = -c - 1;
            ans.add((long)c);
            temp.add(c, arr[i]);
        }
        return ans;
    }
     */


}


/*


9
17
0
79
284
309
74
87
491
1
225
1
22
315
332
65
387
329
363
276
229
42
52
22
13
23
2
9
427
61
30
4
14
405
520
453
40
42
45655
37830
16473
46421
24097


 */
