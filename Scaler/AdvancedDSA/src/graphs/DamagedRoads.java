package src.graphs;

import java.util.ArrayList;

public class DamagedRoads {

    class Pair {
        int type;
        int cost;
        public Pair(int c, int t) {
            cost = c;
            type = t;
        }
    }

    public int solve(int[] A, int[] B) {
        ArrayList<Pair> edgeList = new ArrayList<>();
        for (int j : A) {
            edgeList.add(new Pair(j, 0));
        }
        for (int j : B) {
            edgeList.add(new Pair(j, 1));
        }
        edgeList.sort((a, b) -> {
            if (a.cost == b.cost) return Integer.compare(a.type, b.type);
            return Integer.compare(a.cost, b.cost);
        });
        int N = A.length+1;
        int M = B.length+1;
        long ans = 0L;
        int mod = (int)Math.pow(10, 9) + 7;
        for(Pair edge: edgeList) {
            if(edge.type == 0) {
                ans = (ans % mod + (long) edge.cost % mod * M % mod) % mod;
                N--;
            }
            else {
                ans = (ans % mod + (long) edge.cost % mod * N % mod) % mod;
                M--;
            }
        }
        return (int)ans;
    }

}
