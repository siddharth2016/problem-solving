package practiceproblems.strings;

public class ReverseTheString {

    public void reverseString(StringBuilder sb, int l, int r) {
        while(l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++; r--;
        }
    }

    public String solve(String A) {
        A = A.trim();
        StringBuilder sb = new StringBuilder(A);
        reverseString(sb, 0, A.length()-1);

        int l = 0, r = 0;
        StringBuilder result = new StringBuilder();
        while(r < A.length()) {
            while(r < A.length() && sb.charAt(r) != ' ') {
                r++;
            }

            reverseString(sb, l, r-1);

            while(r < A.length() && sb.charAt(r) == ' ') {
                r++; l=r;
            }
        }

        char prev = ' ';
        for(int i=0; i<A.length(); i++) {
            if(prev == ' ' && sb.charAt(i) == ' ') continue;
            result.append(sb.charAt(i));
            prev = sb.charAt(i);
        }

        return result.toString();
    }

}
