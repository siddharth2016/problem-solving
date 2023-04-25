package practiceproblems.stacksandqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParantheses2 {

    public int solve(String A) {
        Deque<Character> stack = new ArrayDeque<>();

        for(Character chr: A.toCharArray()) {
            if(chr == '(' || chr == '{' || chr == '[') stack.addLast(chr);
            else if(!stack.isEmpty() &&
                    (
                            (chr == ')' && stack.getLast() == '(') ||
                                    (chr == '}' && stack.getLast() == '{') ||
                                    (chr == ']' && stack.getLast() == '[')
                    )) stack.removeLast();
            else return 0;
        }

        if(stack.isEmpty()) return 1;
        return 0;
    }

}
