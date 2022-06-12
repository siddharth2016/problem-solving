package practiceproblems.week8.strings;

import java.util.Scanner;

public class LengthOfStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt(); scan.nextLine();
        while(test--!=0) {
            String input = scan.nextLine();
            System.out.println(input.length());
        }
    }

}
