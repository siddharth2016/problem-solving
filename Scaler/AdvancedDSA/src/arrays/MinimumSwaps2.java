package src.arrays;

import java.util.HashMap;

public class MinimumSwaps2 {

    public int solve(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        for(int i=0; i<n; i++) {
            map.put(A[i], i);
        }
        int swaps = 0;
        for(int i=0; i<n; i++) {
            if(map.get(i) != i) {
                A[map.get(i)] = A[i];
                map.put(A[i], map.get(i));

                A[i] = i;
                map.put(A[i], i);

                swaps++;
            }
        }

        return swaps;
    }

}
