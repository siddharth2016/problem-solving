package src.stacks;

import java.util.Arrays;
import java.util.Stack;

public class TwoBracketExpression {

    public static void main(String[] args) {
        System.out.println(solve("-((-(-(-a+b)-(q+c)+(d-(e+f)))+s-w))", "a+b-c-d+e-f+g+h+i"));
    }

    public static int solve(String A, String B) {
        char[] strA = calculateSigns(A);
        char[] strB = calculateSigns(B);

        for(int i=0; i<strA.length; i++) {
            if(strA[i] != strB[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static char[] calculateSigns(String str) {
        Stack<Character> globalOperators = new Stack<Character>();
        char[] outArr = new char[26];
        Arrays.fill(outArr, '+');
        int n = str.length();
        char localOperator = '+';      //This is to keep track of the sign comes immediately before the number
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);

            if(ch == '-' || ch == '+') {
                if(globalOperators.isEmpty()) {
                    localOperator = ch;
                } else {
                    localOperator = giveProperSign(globalOperators.peek(), ch);
                }
                continue;
            }

            if(ch == '(') {
                globalOperators.push(localOperator);
                continue;
            }

            if(ch == ')') {
                globalOperators.pop();
                continue;
            }

            outArr[ch - 'a'] = localOperator;
        }

        return outArr;
    }

    public static char giveProperSign(char operator1, char operator2) {
        if((operator1 == '-' && operator2 == '+') || (operator1 == '+' && operator2 == '-')) {
            return '-';
        }

        return '+';
    }
}
