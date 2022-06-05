package practiceproblems.week5;

import java.util.Scanner;

public class IsItPrime {

    private static boolean checkPrime(int n) {
        boolean prime = n != 1;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        if(checkPrime(A)) System.out.println("YES");
        else System.out.println("NO");
        scan.close();
    }

}
