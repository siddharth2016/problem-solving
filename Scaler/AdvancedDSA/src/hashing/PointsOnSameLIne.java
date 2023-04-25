package src.hashing;

import java.util.HashMap;

public class PointsOnSameLIne {

    public int solve(int[] A, int[] B) {
        int ans = 0;
        int n = A.length;
        HashMap<Double,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            int cnt = 0;
            for(int j = 0;j<n;j++){
                if(A[i]==A[j] && B[i]==B[j]){
                    cnt++;
                    continue;
                }
                double slope = (double)(B[j]-B[i])/(double)(A[j]-A[i]);
                mp.put(slope,mp.getOrDefault(slope,0)+1);
            }
            ans = Math.max(ans,cnt);
            for(double tmp:mp.keySet()){
                ans = Math.max(ans,mp.get(tmp)+cnt);
            }
            mp.clear();
        }
        return ans;
    }

}
