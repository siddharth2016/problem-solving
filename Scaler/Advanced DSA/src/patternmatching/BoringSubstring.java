package src.patternmatching;

import java.util.HashSet;

public class BoringSubstring {

    public int solve(String A) {
        HashSet<Character> set = new HashSet<>();
        for(char chr: A.toCharArray()) {
            set.add(chr);
        }
        if(set.size() == 1 || set.size() > 3) return 1;
        else if(set.size() == 2) {
            for(char chr: set) {
                char nextChar = ' ';
                char prevChar = ' ';
                if(chr == 'a') nextChar = (char)(chr + 1);
                else if(chr == 'z') prevChar = (char)(chr - 1);
                else {
                    nextChar = (char)(chr + 1);
                    prevChar = (char)(chr - 1);
                }
                if(set.contains(nextChar) || set.contains(prevChar)) return 0;
            }
            return 1;
        }
        else {
            int prev = 0;
            int next = 0;
            int count = 0;
            for(char chr: set) {
                char nextChar = ' ';
                char prevChar = ' ';
                if(chr == 'a') nextChar = (char)(chr + 1);
                else if(chr == 'z') prevChar = (char)(chr - 1);
                else {
                    nextChar = (char)(chr + 1);
                    prevChar = (char)(chr - 1);
                }
                if(set.contains(nextChar)) next++;
                if(set.contains(prevChar)) prev++;
            }
            if(next == 2 || prev == 2) return 0;
            return 1;
        }
    }

}
