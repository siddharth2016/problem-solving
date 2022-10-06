package practiceproblems.stacksandqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParantheses {

    public int solve(String A) {
        Deque<Character> stack = new ArrayDeque<>();

        for(Character chr: A.toCharArray()) {
            if(chr == '(') stack.push(chr);
            else if(chr == ')' && !stack.isEmpty()) stack.pop();
            else return 0;
        }

        if(stack.isEmpty()) return 1;
        return 0;
    }

}
