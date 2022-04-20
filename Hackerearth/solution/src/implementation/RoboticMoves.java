// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/robotic-moves-98b936fb/

package implementation;

import java.util.Scanner;

public class RoboticMoves {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            long n = scanner.nextLong();
            long sum = (n * (n+1)) / 2;
            System.out.println(sum * 2);
        }
    }

}
