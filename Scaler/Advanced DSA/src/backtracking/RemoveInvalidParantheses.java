package src.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveInvalidParantheses {

    Set<String> result;
    int maxLen;
    public String[] solve(String A) {
        result = new HashSet<>();
        maxLen = Integer.MIN_VALUE;
        getValidStrings(A, "", 0, 0, 0);
        String[] ans = new String[result.size()];
        ans = (new ArrayList<String>(result)).toArray(ans);
        return ans;
    }

    public void getValidStrings(String A, String curr, int index, int open, int close) {
        if(close > open) return;

        if(valid(curr) && maxLen <= curr.length()) {
            if(curr.length() == maxLen) {
                result.add(curr);
            }
            else {
                maxLen = curr.length();
                result.clear();
                result.add(curr);
            }
        }

        if(index >= A.length()) return;

        char chr = A.charAt(index);
        if(chr == '(') {
            getValidStrings(A, curr + chr, index+1, open+1, close);
            getValidStrings(A, curr, index+1, open, close);
        }
        else if(chr == ')') {
            getValidStrings(A, curr + chr, index+1, open, close+1);
            getValidStrings(A, curr, index+1, open, close);
        }
        else {
            getValidStrings(A, curr + chr, index+1, open, close);
        }
    }

    public boolean valid(String A) {
        Stack<Character> stack = new Stack<>();
        for(Character chr: A.toCharArray()) {
            if(chr >= 'a' && chr <= 'z') continue;

            if(chr == '(') stack.push(chr);
            else {
                if(stack.empty()) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }
}
