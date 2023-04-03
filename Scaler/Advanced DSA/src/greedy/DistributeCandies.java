package src.greedy;

import java.util.Arrays;

public class DistributeCandies {
    public int candy(int[] A) {
        int N = A.length;
        int cl[] = new int[N];
        Arrays.fill(cl, 1);
        int cr[] = new int[N];
        Arrays.fill(cr, 1);
        int c[] = new int[N];
        int ans=0;
        for(int i=1;i<N;i++){
            if(A[i]>A[i-1]){
                cl[i]= cl[i-1]+1;

            }
        }
        for(int i=N-2;i>=0;i--){
            if(A[i]>A[i+1]){
                cr[i]= cr[i+1]+1;

            }
        }
        for(int i=0;i<N;i++){
            c[i]=Math.max(cl[i],cr[i]);
        }
        for(int i=0;i<N;i++){
            ans+=c[i];
        }
        return ans;
    }
}
