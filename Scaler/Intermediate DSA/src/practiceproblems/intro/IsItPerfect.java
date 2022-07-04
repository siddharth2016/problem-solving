package practiceproblems.intro;

import java.util.Scanner;

public class IsItPerfect {

    private static int sumOfDivisors(int a) {
        int sumDiv = 1;
        for(int i=2; i*i<=a; i++) {
            if(a % i == 0) {
                sumDiv += i;
                if(i * i != a) {
                    sumDiv += a / i;
                }
            }
        }
        return sumDiv;
    }

    private static boolean isItPerfect(int a) {
        return sumOfDivisors(a) == a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n--!=0) {
            int a = scan.nextInt();
            System.out.println(isItPerfect(a) ? "YES" : "NO");
        }
    }

}
