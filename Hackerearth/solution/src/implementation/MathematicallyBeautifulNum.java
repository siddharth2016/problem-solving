// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/mathematically-beautiful-numbers-174a158e/

package implementation;

import java.util.Scanner;

public class MathematicallyBeautifulNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            long x = scanner.nextLong();
            int k = scanner.nextInt();
            while(x != 0 && x % k <= 1) {
                x = x / k;
            }
            if(x == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
