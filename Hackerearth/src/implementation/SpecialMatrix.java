// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/special-matrix-2-e2e9f0f4/

package src.implementation;

import java.util.*;

public class SpecialMatrix {

    public static void main(String[] args) {
        int length = 2000001;
        int[] prime = new int[length];
        Arrays.fill(prime, 0);
        for (int i = 2; i < length; i++) {
            if (prime[i] == 0) {
                prime[i] = 1;
                for (int j = i * 2; j < length; j += i) {
                    prime[j] += 1;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test-- != 0) {
            long count = 0;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int X = n + m;

            int val = 0;
            int row = 1;
            int col = 1;

            for(val=2; val<=X/2; val++) {
                int q = Math.min(col - row + 1, n);
                count = count + (prime[val] * q);
                col++;
            }
            System.out.println(col + " " + val);
            while(col != m) {
                count = count + (prime[val] * Math.min(col - row + 1, n));
                col++;
                val++;
            }
            if (n == m) {
                count = count + (prime[val] * n);
                val++;
                row++;
                for(int i=val; i<=X; i++) {
                    count = count + (prime[i] * (col - row + 1));
                    row++;
                }
            }
            else {
                for(int i=val; i<=X; i++) {
                    count = count + (prime[i] * Math.min(m, n));
                    n--;
                }
            }
            System.out.println(count);
        }
    }
}
