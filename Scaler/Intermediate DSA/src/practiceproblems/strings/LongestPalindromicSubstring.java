package practiceproblems.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {

    public void oddPalindromeSubstring(String str, int i, Map<String, Integer> dp) {
        int l = i;
        int r = i;
        while(l>=0 && r<str.length() && str.charAt(l) == str.charAt(r)) {
            l--; r++;
        }
        l++; r--;
        updateDP(l, r, dp);
    }

    public void evenPalindromeSubstring(String str, int i, Map<String, Integer> dp) {
        int l = i;
        int r = i+1;
        while(l>=0 && r<str.length() && str.charAt(l) == str.charAt(r)) {
            l--; r++;
        }
        l++; r--;
        updateDP(l, r, dp);
    }

    public void updateDP(int l, int r, Map<String, Integer> dp) {
        if(dp.get("len") < (r-l+1)) {
            dp.put("l", l);
            dp.put("r", r);
            dp.put("len", r-l+1);
        }
        else if(dp.get("len") == (r-l+1) && dp.get("l") > l) {
            dp.put("l", l);
            dp.put("r", r);
        }
    }

    public String longestPalindrome(String A) {
        Map<String, Integer> dp = new HashMap<>();
        dp.put("l", A.length()-1);
        dp.put("r", A.length()-1);
        dp.put("len", 0);

        for(int i=0; i<A.length(); i++) {
            oddPalindromeSubstring(A, i, dp);
        }

        for(int i=0; i<A.length()-1; i++) {
            evenPalindromeSubstring(A, i, dp);
        }

        return A.substring(dp.get("l"), dp.get("r") + 1);
    }

}
