package practiceproblems.subseqsubsets;

public class FindSubsequence {

    public String solve(String A, String B) {
        int i=0;
        int j=0;
        while(i<B.length() && j<A.length()) {
            if(A.charAt(j) == B.charAt(i)) j++;
            i++;
        }
        if(j == A.length()) return "YES";
        return "NO";
    }

}
