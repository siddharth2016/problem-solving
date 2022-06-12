package practiceproblems.week8.strings;

public class IsItPalindrome {

    public int solve(String A) {
        int len = A.length();
        int palin = 1;
        for(int i=0; i<len/2; i++) {
            if(A.charAt(i) != A.charAt(len-i-1)) {
                palin = 0;
                break;
            }
        }
        return palin;
    }

}
