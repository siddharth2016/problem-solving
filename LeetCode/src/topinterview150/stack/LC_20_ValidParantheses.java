package src.topinterview150.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC_20_ValidParantheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for(Character chr: s.toCharArray()) {
            if(chr == ')' || chr=='}' || chr==']') {
                if(stack.isEmpty() || map.get(stack.peek()) != chr) return false;
                stack.pop();
            }
            else stack.push(chr);
        }
        return stack.isEmpty();
    }

}
