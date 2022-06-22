package practiceproblems.week8.strings;

public class CompareTheString2 {

    public int solve(String A, String B) {
        int comp = A.compareTo(B);
        if(comp < 0) comp = -1;
        else if(comp > 0) comp = 1;
        else comp = 0;
        return comp;
    }

}
