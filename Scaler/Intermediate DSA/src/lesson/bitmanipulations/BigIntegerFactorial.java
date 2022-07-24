package lesson.bitmanipulations;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger fact = BigInteger.ONE;
        for(int i=1; i<=n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

}
