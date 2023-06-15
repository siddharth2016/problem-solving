package src.topinterview150.twopointers;

import java.util.ArrayList;
import java.util.List;

public class LC_125_ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        List<Character> arr = new ArrayList<>();
        int pos = 0;
        for(char chr: s.toCharArray()) {
            if('a' <= chr && chr <= 'z' || 'A' <= chr && chr <= 'Z') {
                arr.add(Character.toLowerCase(chr));
            }
        }

        return isPalin(arr);
    }

    public static boolean isPalin(List<Character> arr) {
        int start = 0;
        int end = arr.size() - 1;
        while(start < end) {
            if(arr.get(start) != arr.get(end)) return false;
            start++; end--;
        }
        return true;
    }

}
