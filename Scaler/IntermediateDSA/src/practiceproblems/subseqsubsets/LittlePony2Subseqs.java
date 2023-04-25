package practiceproblems.subseqsubsets;

public class LittlePony2Subseqs {

    public String solve(String A) {
        int mini = 0;
        for(int i=0; i<A.length()-1; i++) {
            if(A.charAt(i) < A.charAt(mini)) mini = i;
        }
        int minj = mini + 1;
        for(int j=mini+1; j<A.length(); j++) {
            if(A.charAt(j) < A.charAt(minj)) minj = j;
        }
        return "" + A.charAt(mini) + A.charAt(minj);
    }

}
