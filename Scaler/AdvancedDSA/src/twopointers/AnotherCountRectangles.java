package src.twopointers;

public class AnotherCountRectangles {

    public static void main(String[] args) {
        System.out.println(solve(new int[] {1, 2, 3, 4, 5}, 5));
    }

    public static int solve(int[] A, int B) {
        int i = 0;
        int j = A.length - 1;
        int ans = 0;
        while(i <= j) {
            long area = (long) A[i] * (long) A[j];
            if (area < B) {
                ans = (ans + 2 * (j - i)) % 1000000007;
                if ((long) A[i] * A[i] < B) {
                    ans = (ans + 1) % 1000000007;
                }
                i++;
            } else {
                if ((long) A[j] * A[j] < B) {
                    ans = (ans + 1) % 1000000007;
                }
                j--;
            }
        }
        return ans;
    }

}
