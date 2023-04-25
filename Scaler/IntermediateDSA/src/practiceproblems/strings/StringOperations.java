package practiceproblems.strings;

public class StringOperations {

    public String solve(String A) {
        A += A;
        StringBuilder sb = new StringBuilder();
        for(char elem: A.toCharArray()) {
            if(!('A' <= elem && elem <= 'Z')) sb.append(elem);
        }
        for(int i=0; i<sb.length(); i++) {
            char elem = sb.charAt(i);
            if('a' == elem || 'e' == elem || 'i' == elem || 'o' == elem || 'u' == elem) {
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }

}
