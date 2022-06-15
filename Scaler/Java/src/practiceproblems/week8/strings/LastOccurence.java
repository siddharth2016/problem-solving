package practiceproblems.week8.strings;

public class LastOccurence {

    public int solve(final String A, final int B) {
        char b = (char)B;
        int indx = -1;
        while(A.indexOf(b, indx+1)!=-1) {
            indx = A.indexOf(b, indx+1);
        }
        return indx;
    }

}
