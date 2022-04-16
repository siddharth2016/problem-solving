// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/stevie/

package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Stevie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] A = new long[n];
        long[] B = new long[n];
        Map<Long, Long> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            A[i] = scanner.nextLong();
        }

        for(int i=0; i<n; i++) {
            B[i] = scanner.nextLong();
        }

        for(int i=0; i<n; i++) {
            long val = map.getOrDefault(A[i], B[i]);
            long maxVal = Long.max(val, B[i]);
            map.put(A[i], maxVal);
        }

        for(int i=0; i<n; i++) {
            System.out.print(map.get(A[i]) + " ");
        }
    }

}
