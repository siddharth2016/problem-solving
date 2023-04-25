package src.hashing;

import java.util.HashMap;

public class CountRightTriangles {

    public int solve(int[] A, int[] B) {
        HashMap<Integer, Integer> mapx = new HashMap<>();
        HashMap<Integer, Integer> mapy = new HashMap<>();

        for(int i=0; i<A.length; i++) {
            mapx.put(A[i], mapx.getOrDefault(A[i], 0) + 1);
            mapy.put(B[i], mapy.getOrDefault(B[i], 0) + 1);
        }
        int mod = (int)Math.pow(10, 9) + 7;
        long ans = 0l;
        for(int i=0; i<A.length; i++) {
            ans = (ans % mod + ((mapx.get(A[i]) - 1) * (mapy.get(B[i]) - 1)) % mod) % mod;
        }

        return (int)ans;
    }

}
