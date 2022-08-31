package practiceproblems.strings;

public class SimpleReverse {

    public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        int l = 0;
        int r = A.length()-1;
        while(l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++; r--;
        }
        return sb.toString();
    }

}
