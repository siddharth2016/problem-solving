package practiceproblems.interviewprobs;

public class LongestConsecutiveOnes {

    private int[] getRightSum(String A, int n) {
        int[] result = new int[n];
        int count = 0;
        for(int i=n-1; i>=0; i--) {
            if(A.charAt(i) == '1') {
                result[i] = 0;
                count++;
            }
            else {
                result[i] = count;
                count = 0;
            }
        }
        return result;
    }

    private int[] getLeftSum(String A, int n) {
        int[] result = new int[n];
        int count = 0;
        for(int i=0; i<n; i++) {
            if(A.charAt(i) == '1') {
                result[i] = 0;
                count++;
            }
            else {
                result[i] = count;
                count = 0;
            }
        }
        return result;
    }

    private int getTotalOnes(String A) {
        int sum = 0;
        for(int i=0; i<A.length(); i++) {
            if(A.charAt(i) == '1') sum ++;
        }
        return sum;
    }

    public int solve(String A) {
        int n = A.length();
        int[] leftSum = getLeftSum(A, n);
        int[] rightSum = getRightSum(A, n);
        int totalOnes = getTotalOnes(A);
        int maxCount = 0;
        for(int i=0; i<n; i++) {
            if(A.charAt(i) == '0') {
                int count = leftSum[i] + rightSum[i] + 1;
                int ones = count > totalOnes ? totalOnes : count;
                maxCount = Math.max(maxCount, ones);
            }
        }
        return maxCount == 0 ? totalOnes : maxCount;
    }

}
