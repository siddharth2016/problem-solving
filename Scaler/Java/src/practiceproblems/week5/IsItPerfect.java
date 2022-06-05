package practiceproblems.week5;

import java.util.Scanner;

public class IsItPerfect {

    private static int sumOfDivisors(int n) {
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) sum += i;
        }
        return sum;
    }

    private static boolean isItPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int A = scan.nextInt();
            if(isItPerfect(A)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
