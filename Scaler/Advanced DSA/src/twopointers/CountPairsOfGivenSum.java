package src.twopointers;

public class CountPairsOfGivenSum {

    public int solve(int[] A, int B) {
        int count = 0;
        int i = 0;
        int j = A.length-1;
        while(i < j) {
            if(A[i] + A[j] == B) {
                count++;
                i++;j--;
            }
            else if(A[i] + A[j] < B) {
                i++;
            }
            else {
                j--;
            }
        }
        return count;
    }

}
