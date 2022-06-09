package practiceproblems.week6.functions;

import java.util.Scanner;

public class Binary2Decimal {

    private static void printDecimal(String num) {
        int res = 0;
        int power = num.length()-1;
        for(char chr: num.toCharArray()) {
            if(chr == '1') {
                res += (int) Math.pow(2, power);
            }
            power--;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        printDecimal(A);
    }

}
