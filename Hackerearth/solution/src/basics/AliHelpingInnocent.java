// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/

package basics;

import java.util.Scanner;

public class AliHelpingInnocent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("-");
        int val = Integer.parseInt(Character.toString(input[1].charAt(0)))
                + Integer.parseInt(Character.toString(input[1].charAt(1)));
        char chr = input[0].charAt(2);
        int val2 = Integer.parseInt(Character.toString(input[0].charAt(0)))
                + Integer.parseInt(Character.toString(input[0].charAt(1)));
        int val3 = Integer.parseInt(Character.toString(input[0].charAt(3)))
                + Integer.parseInt(Character.toString(input[0].charAt(4)));
        int val4 = Integer.parseInt(Character.toString(input[0].charAt(4)))
                + Integer.parseInt(Character.toString(input[0].charAt(5)));
        if((val % 2 != 0) || (val2 % 2 != 0) || (val3 % 2 != 0) || (val4 % 2 != 0)
                || (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' || chr == 'Y')) {
            System.out.println("invalid");
        }
        else {
            System.out.println("valid");
        }
    }

}
