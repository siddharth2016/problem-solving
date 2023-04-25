package practiceproblems.bitmanipulations;

import java.util.ArrayList;

public class SubArraysWithBitwiseOrOne {

    public Long solve(int A, ArrayList<Integer> B) {
        long count = 0l;
        long totalSubArr = (long) (((long)A * (long)(A+1)) / 2l);
        for(Integer elem:B) {
            if(elem == 0) count++;
            else {
                totalSubArr -= (long) ((count * (count + 1l)) / 2l);
                count = 0l;
            }
        }
        if(count != 0) totalSubArr -= (long) ((count * (count + 1l)) / 2l);
        return totalSubArr;
    }

}
