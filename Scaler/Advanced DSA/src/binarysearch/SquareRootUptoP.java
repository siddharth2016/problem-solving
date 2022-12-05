package src.binarysearch;

public class SquareRootUptoP {

    public static void main(String[] args) {
        System.out.println(sqrtNUptoP(10, 3));
    }

    public static float sqrtNUptoP(int N, int p) {
        int n = sqrtN(N);
        float prec = 0.1f;
        float ans = (float)n;
        for(int i=0; i<p; i++) {
            while (ans * ans <= N) {
                ans += prec;
            }
            ans -= prec;
            prec = prec/10;
            System.out.println(ans);
        }
        return ans;
    }

    public static int sqrtN(int N) {
        int s = 0;
        int e = N;
        int ans = -1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(mid * mid <= N) {
                ans = mid;
                s = mid+1;
            }
            else e = mid - 1;
        }
        return ans;
    }

}
