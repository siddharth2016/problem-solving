package src.arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

    public int maxArr(ArrayList<Integer> A) {
        int maxForI = Integer.MIN_VALUE;
        int minForI = Integer.MAX_VALUE;
        int minForJ = Integer.MAX_VALUE;
        int maxForJ = Integer.MIN_VALUE;

        for(int i=0; i<A.size(); i++) {
            maxForI = Integer.max(maxForI, A.get(i) + i);
            minForI = Integer.min(minForI, A.get(i) + i);

            maxForJ = Integer.max(maxForJ, A.get(i) - i);
            minForJ = Integer.min(minForJ, A.get(i) - i);
        }

        return Integer.max(maxForI - minForI, maxForJ - minForJ);
    }

}
