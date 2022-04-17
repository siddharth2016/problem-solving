// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/special-matrix-2-e2e9f0f4/

package implementation;

import java.util.*;

public class SpecialMatrix {

    public static void main(String[] args) {
        int length = 2000001;
        int[] prime = new int[length];
        Arrays.fill(prime, 0);
        for (int i = 2; i < length; i++) {
            if (prime[i] < 1) {
                prime[i] += 1;
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
            int val;
            int t = 0;
            for(val=2; val<=X/2+1; val++) {
                t++;
                count = count + (prime[val] * t);
            }
            if (X % 2 == 0) {
                t--;
            }
            for(int i=val; i<=X; i++) {
                count = count + (prime[i] * t);
                t--;
            }
            System.out.println(count);
        }
    }
}
