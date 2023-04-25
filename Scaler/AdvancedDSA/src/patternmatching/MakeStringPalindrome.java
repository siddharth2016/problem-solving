package src.patternmatching;

import java.util.Arrays;

public class MakeStringPalindrome {

    public static void main(String[] args) {
        System.out.println(solve("aaaaa"));
    }

    public static int getLPS(String A) {
        int len = A.length();
        int[] lps = new int[len];
        lps[0] = 0;
        for(int i=1; i<len; i++) {
            int x = lps[i-1];
            while(A.charAt(i) != A.charAt(x)) {
                if(x == 0) {
                    x = -1;
                    break;
                }
                x = lps[x-1];
            }
            lps[i] = x+1;
        }
        System.out.println(Arrays.toString(lps));
        return lps[len - 1];
    }

    public static int solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        String newStr = A + sb.toString();
        if(A.equals(sb.toString())) return 0;
        System.out.println(newStr);
        int prefixPalindromeCount = getLPS(newStr);
        return A.length() - prefixPalindromeCount;
    }

}
