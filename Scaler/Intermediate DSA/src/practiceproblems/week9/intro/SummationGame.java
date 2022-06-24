package practiceproblems.week9.intro;

import java.util.Scanner;

public class SummationGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((n * (n+1)) / 2);
    }

}
