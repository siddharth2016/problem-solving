// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/anti-plaindrome-2-72ff6f62/

package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class AntiPalindromeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt(); scanner.nextLine();
        while(test--!=0) {
            String str = scanner.nextLine();
            if(isPalindrome(str)) System.out.println(-1);
            else {
                char[] arr = str.toCharArray();
                Arrays.sort(arr);
                System.out.println(String.valueOf(arr));
            }
        }
    }

    static boolean isPalindrome(String str) {
        boolean isPalin = true;
        int n = str.length();
        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                isPalin = false;
                break;
            }
        }
        return isPalin;
    }

}
