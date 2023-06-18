package src.topinterview150.stack;

import java.util.Stack;

public class LC_224_BasicCalculator {

    public int calculate(String s) {
        Stack<Integer> signStack = new Stack<>();
        signStack.push(1);

        int result = 0;
        int sign = 1;
        int number = 0;

        for(Character chr: s.toCharArray()) {
            if(Character.isDigit(chr)) number = number * 10 + (chr - '0');
            else if(chr == '+' || chr == '-') {
                result += sign * number;
                sign = signStack.peek() * (chr == '+' ? 1:-1);
                number = 0;
            }
            else if(chr == '(') signStack.push(sign);
            else if(chr == ')') signStack.pop();
        }

        result += sign * number;
        return result;
    }

}
