package practiceproblems.prefixsum;

import java.util.ArrayList;
import java.util.Scanner;

public class PickFromBothSides {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<n; i++) {
            A.add(scan.nextInt());
        }
        int B = scan.nextInt();
        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int[] prefixSum = new int[n];
        int cumSum = 0;
        for(int i=0; i<n; i++) {
            cumSum += A.get(i);
            prefixSum[i] = cumSum;
        }
        int maxPossible = prefixSum[B-1];
        if(n == B) return maxPossible;
        if(maxPossible < (prefixSum[n-1] - prefixSum[n-B-1])) maxPossible = prefixSum[n-1] - prefixSum[n-B-1];
        int i = n-B+1;
        int j = 0;
        while(i < n) {
            int tempSum = prefixSum[n-1] - prefixSum[i-1] + prefixSum[j];
            if(tempSum > maxPossible) maxPossible = tempSum;
            i++; j++;
        }
        return maxPossible;
    }

}


/*

-533 -666 -500 169 724 478 358 -38 -536 705 -855 281 -173 961 -509 -5 942 -173 436 -609 -396 902 -847 -708 -618 421 -284 718 895 447 726 -229 538 869 912 667 -701 35 894 -297 811 322 -667 673 -336 141 711 -747 -132 547 644 -338 -243 -963 -141 -277 741 529 -222 -684 35

 */