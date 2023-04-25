// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/make-all-equal-90a21ab2/

package src.basics;

import java.util.*;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i=0; i<n; i++) {
            A[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++) {
            B[i] = scanner.nextInt();
        }
        Integer min = Arrays.stream(A).min().getAsInt();

        int i=0;
        int count=0;
        boolean found = true;
        while(i<n) {
            while(A[i]>min) {
                A[i] -= B[i];
                count++;
            }
            if(A[i]<0) {
                found = false;
                break;
            }
            else{
                if(A[i]<min) {
                    min = A[i];
                    i = -1;
                }
                i++;
            }
        }
        if(found) {
            for(int j=1; j<n; j++) {
                if (A[j] != A[j - 1]) {
                    found = false;
                    break;
                }
            }
        }
        System.out.println(found ? count : -1);
    }
}
