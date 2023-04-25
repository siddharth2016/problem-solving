// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/special-number-9-a0cda359/

package src.implementation;

import java.util.Scanner;

public class ASpecialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int num = scanner.nextInt();
            int sumOfDigits = getSumOfDigits(num);
            if (sumOfDigits % 4 == 0) System.out.println(num);
            else {
                for(int i=num+1; i<num+10; i++) {
                    int sod = getSumOfDigits(i);
                    if (sod % 4 == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }

    static int getSumOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
