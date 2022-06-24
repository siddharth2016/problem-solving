package practiceproblems.week9.intro;

public class PerfectSquareSqrt {

    private int getSqrt(int n) {
        int low = 1;
        int high = n;
        long mid = n / 2;
        while(low<=high) {
            if(mid * mid < n) low = (int)mid + 1;
            else if(mid * mid > n) high = (int)mid - 1;
            else break;
            mid = (low + high) / 2;
        }
        return (int)mid;
    }

    private int perfectSquare(int n) {
        int sqrt = getSqrt(n);
        return (sqrt * sqrt) == n ? sqrt : -1;
    }

    public int solve(int A) {
        return perfectSquare(A);
    }

}
