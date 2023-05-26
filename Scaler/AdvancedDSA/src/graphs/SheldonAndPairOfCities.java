package src.graphs;

import java.util.Arrays;

public class SheldonAndPairOfCities {

    public int[] solve(int A, int B, int C, int[] D, int[] E, int[] F, int[] G, int[] H) {
        int[][] cities = new int[A+1][A+1];
        for(int[] arr: cities) {
            Arrays.fill(arr, -1);
        }
        for(int i=0; i<B; i++) {
            if(cities[D[i]][E[i]] == -1 || cities[D[i]][E[i]] > F[i]) {
                cities[D[i]][E[i]] = F[i];
                cities[E[i]][D[i]] = F[i];
            }
        }

        for(int k=1; k<=A; k++) {
            for(int i=1; i<=A; i++) {
                for(int j=1; j<=A; j++) {
                    if(i == j) {
                        cities[i][j] = 0;
                        continue;
                    }
                    if(i == k || j == k) continue;
                    int edgeik = cities[i][k];
                    int edgejk = cities[j][k];
                    if(edgeik == -1 || edgejk == -1) continue;
                    int newWeight = edgeik + edgejk;
                    if(cities[i][j] == -1 || cities[i][j] > newWeight) cities[i][j] = newWeight;
                }
            }
        }

        int[] result = new int[C];
        for(int i=0; i<C; i++) {
            result[i] = cities[G[i]][H[i]];
        }

        return result;
    }

}
