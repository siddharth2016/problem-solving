package src.stacks;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {

    public int solve(String A) {
        HashMap<Character, Character> paranMap = new HashMap<>();
        paranMap.put('}', '{');
        paranMap.put(']', '[');
        paranMap.put(')', '(');

        Stack<Character> stack = new Stack<>();

        for(Character chr: A.toCharArray()) {
            if(paranMap.containsKey(chr)) {
                if(stack.isEmpty()) return 0;
                if(stack.peek() != paranMap.get(chr)) return 0;
                stack.pop();
            }
            else {
                stack.push(chr);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
