package src.hashing;

import java.util.HashMap;

public class CompareSortedSubarrays {

    public int[] createPrefixSum(int[] arr) {
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            result[i] = result[i-1] + arr[i];
        }
        return result;
    }

    public int findSum(int i, int j, int[] arr) {
        if(i == 0) return arr[j];
        return arr[j] - arr[i-1];
    }

    public int[] solve(int[] A, int[][] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefixSum = createPrefixSum(A);
        int[] result = new int[B.length];
        for(int i=0; i<B.length; i++) {
            int l1 = B[i][0];
            int r1 = B[i][1];
            int l2 = B[i][2];
            int r2 = B[i][3];
            map.clear();
            int leftSum = findSum(l1, r1, prefixSum);
            int rightSum = findSum(l2, r2, prefixSum);
            if(leftSum == rightSum) {
                if(r1-l1 == r2-l2) {
                    for(int j=l1; j<=r1; j++) {
                        map.put(A[j], map.getOrDefault(A[j], 0) + 1);
                    }
                    for(int j=l2; j<=r2; j++) {
                        if(!map.containsKey(A[j])) {
                            result[i] = 0;
                            break;
                        }
                        map.put(A[j], map.get(A[j]) - 1);
                        if(map.get(A[j]) == 0) map.remove(A[j]);
                    }
                    if(map.size() == 0) result[i] = 1;
                    else result[i] = 0;
                }
                else result[i] = 0;
            }
            else result[i] = 0;
        }
        return result;
    }

}
