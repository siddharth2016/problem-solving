package practiceproblems.strings;

public class AmazingSubstrings {

    public int solve(String A) {
        int len = A.length();
        int amazingSubstr = 0;
        for(int i=0; i<len; i++) {
            char e = A.charAt(i);
            if('a' == e || 'e' == e || 'i' == e || 'o' == e || 'u' == e ||
                    'A' == e || 'E' == e || 'I' == e || 'O' == e || 'U' == e) {
                amazingSubstr = (amazingSubstr % 10003 + (len - i) % 10003) % 10003;
            }
        }
        return amazingSubstr;
    }

}
