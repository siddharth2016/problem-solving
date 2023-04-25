package src.hashing;

import java.util.HashSet;

public class CountRectangles {

    public String getKey(int x, int y) {
        return x + "@" + y;
    }

    public int solve(int[] A, int[] B) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            set.add(getKey(A[i], B[i]));
        }
        int count = 0;
        for(int i=0; i<A.length; i++) {
            for(int j=i+1; j<A.length; j++) {
                if(A[i] != A[j] && B[i] != B[j]) {
                    String p1 = getKey(A[j], B[i]);
                    String p2 = getKey(A[i], B[j]);
                    if(set.contains(p1) && set.contains(p2)) count++;
                }
            }
        }
        return count / 2;
    }

}
