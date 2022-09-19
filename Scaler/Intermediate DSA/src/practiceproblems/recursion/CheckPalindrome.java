package practiceproblems.recursion;

public class CheckPalindrome {

    public int solve(String A) {
        if(A.length() <= 1) return 1;
        else if(A.charAt(0) != A.charAt(A.length() - 1)) return 0;
        else return solve(A.substring(1, A.length()-1));
    }

}
