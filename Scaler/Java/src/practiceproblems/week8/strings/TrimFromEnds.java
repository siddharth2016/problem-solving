package practiceproblems.week8.strings;

public class TrimFromEnds {

    public String solve(String A) {
        int initialIndx = 0;
        int lastIndx = A.length() - 1;
        while(initialIndx <= lastIndx) {
            if(A.charAt(initialIndx) != '*') break;
            initialIndx++;
        }
        while(lastIndx >= initialIndx) {
            if(A.charAt(lastIndx) != '*') break;
            lastIndx--;
        }
        return A.substring(initialIndx, lastIndx+1);
    }

}
