package src.twopointers;

public class ClosestPairFromSortedArrays {

    public int[] solve(int[] A, int[] B, int C) {
        int m = A.length;
        int n = B.length;

        int l = 0, r = n-1 ,updatedL = -1, updatedR = -1;
        int minDiff = Integer.MAX_VALUE;

        while(l < m && r>=0){
            int diff = Math.abs((A[l] + B[r]) - C);
            if(diff == minDiff && A[l] == A[updatedL]){    // T.C A = [1], B =[2,4], C = 4
                updatedR = r;
            }
            if(diff < minDiff){
                minDiff = diff;
                updatedL = l;
                updatedR = r;
            }
            if((A[l] + B[r]) > C)
                r--;
            else
                l++;

        }
        return new int[] {A[updatedL],B[updatedR]};
    }

}
