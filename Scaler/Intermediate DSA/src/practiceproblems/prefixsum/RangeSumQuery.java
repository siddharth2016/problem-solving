package practiceproblems.prefixsum;

import java.util.ArrayList;

public class RangeSumQuery {

    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> resultList = new ArrayList<>();
        int n = A.size();
        long[] prefixSum = new long[n];
        prefixSum[0] = A.get(0);
        for(int i=1; i<n; i++) {
            prefixSum[i] = prefixSum[i-1] + A.get(i);
        }
        long lrSum = 0;
        for(ArrayList<Integer> LR: B) {
            if(LR.get(0) == 1) lrSum = prefixSum[LR.get(1) - 1];
            else lrSum = prefixSum[LR.get(1)-1] - prefixSum[LR.get(0) - 2];
            resultList.add(lrSum);
        }
        return resultList;
    }

}
