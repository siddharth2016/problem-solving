package src.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class LC_13_RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int ans = 0;
        int i = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        while(i < n) {
            System.out.println(i);
            System.out.println(i+1<n-1);
            if(i + 1 < n &&
                    ((s.charAt(i) == 'I' && s.charAt(i+1) == 'V') ||
                            (s.charAt(i) == 'X' && s.charAt(i+1) == 'L') ||
                            (s.charAt(i) == 'C' && s.charAt(i+1) == 'D') ||
                            (s.charAt(i) == 'I' && s.charAt(i+1) == 'X') ||
                            (s.charAt(i) == 'X' && s.charAt(i+1) == 'C') ||
                            (s.charAt(i) == 'C' && s.charAt(i+1) == 'M'))) {
                ans += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i += 2;
            }
            else {
                ans += map.get(s.charAt(i));
                i += 1;
            }
            System.out.println(ans);
        }
        return ans;
    }

}
