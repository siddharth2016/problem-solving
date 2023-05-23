package src.may23circuit;

// partially accepted solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ANDSubsequences {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt(); scan.nextLine();
        while(test!=0) {
            int n = scan.nextInt(); int x = scan.nextInt(); scan.nextLine();
            Integer[] arr = new Integer[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            } scan.nextLine();
            int totalSubsequences = countSubseq(arr, n, x);
            System.out.println(totalSubsequences);
            test--;
        }
    }

    public static int countSubseq(Integer[] arr, int n, int x) {
        boolean notPossible = true;
        for(int val: arr) {
            if (val >= x) {
                notPossible = false;
                break;
            }
        }
        if(notPossible) return -1;

        List<List<Integer>> bitMap = new ArrayList<>();
        for(int val: arr) {
            List<Integer> bits = Arrays.asList(new Integer[30]);
            for(int i=0; i<30; i++) {
                if((val & (1<<i)) != 0) bits.set(i, 1);
            }
            bitMap.add(bits);
        }

        int msb = 29;
        while(msb >= 0) {
            if((x & 1<<msb) != 0) break;
            msb--;
        }

        int ans = -1;
        for (int bit = msb; bit < 30; bit++) {
            int count = 0;
            int mask = (int)Math.pow(2, 30) - 1;
            for (int i = 0; i < n; i++) {
                if(bitMap.get(i).get(bit) != null && (mask & arr[i]) >= x) {
                    mask = mask & arr[i];
                    count++;
                }
            }
            if(count != 0) ans = Integer.max(ans, count);
        }

        return ans;

    }

}


/*

3
3 2
1 2 3
5 3
6 1 7 4 3
3 5
1 3 4



 */