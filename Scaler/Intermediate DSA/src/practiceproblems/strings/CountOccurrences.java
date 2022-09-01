package practiceproblems.strings;

public class CountOccurrences {

    public int solve(String A) {
        int count = 0;
        for(int i=0; i<A.length()-2; i++) {
            if(A.charAt(i) == 'b' && A.charAt(i+1) == 'o' && A.charAt(i+2) == 'b') count++;
        }
        return count;
    }

}
