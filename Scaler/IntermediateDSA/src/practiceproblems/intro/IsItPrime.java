package practiceproblems.intro;

import java.util.Scanner;

public class IsItPrime {

    private static int countDivisors(int n) {
        int count = 0;
        for(int i=1; i*i<=n; i++) {
            if(n % i == 0) {
                if(i * i == n) count++;
                else count+=2;
            }
        }
        return count;
    }

    private static boolean isItPrime(int n) {
        return countDivisors(n) == 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        System.out.println(isItPrime(A) ? "YES" : "NO");
    }

}
