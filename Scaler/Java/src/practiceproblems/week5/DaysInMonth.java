package practiceproblems.week5;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        if(A == 1 || A == 3 || A == 5 || A == 7 || A == 8 || A == 10 || A == 12) {
            System.out.println(31);
        }
        else if(A == 4 || A == 6 || A == 9 || A == 11) {
            System.out.println(30);
        }
        else System.out.println(28);
    }

}
