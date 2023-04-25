package practiceproblems.intro;

import java.util.Scanner;

public class ArmstrongNumbers {

    private static int sumOfCubes(int n) {
        int sum = 0;
        while(n != 0) {
            int last = n % 10;
            sum += last * last * last;
            n /= 10;
        }
        return sum;
    }

    private static boolean isArmstrong(int n) {
        return sumOfCubes(n) == n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            if(isArmstrong(i)) System.out.println(i);
        }
    }

}
