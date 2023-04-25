package src.twopointers;

public class PairsWithGivenSum2 {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 9, 10}, 5));
    }

    public static int solve(int[] A, int B) {
        int ans = 0;
        int i = 0;
        int j = A.length - 1;
        int left = 0;
        int right = 0;
        int mod = 1000000007;
        while(i < j) {
            int val = A[i] + A[j];
            if(val == B) {
                int prev = j;
                int count = 0;
                while(i < prev && A[j] == A[prev]) {
                    count++;
                    prev--;
                }
                ans = (ans + count) % mod;
                i++;
            }
            else if(val > B) {
                j--;
            }
            else {
                i++;
            }
        }
        return ans;
    }

}
