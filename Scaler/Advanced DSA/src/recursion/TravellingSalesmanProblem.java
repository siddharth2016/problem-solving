package src.recursion;

public class TravellingSalesmanProblem {

    static int[][] dist = {
            {0,20,42,25},
            {20,0,30,34},
            {42,30,0,10},
            {25,34,10,0}
    };

    static int totalVisits = 15;


    public static int tsp(int visited, int city, int n) {
        if(visited == totalVisits) return dist[city][0];

        int ans = Integer.MAX_VALUE;
        int min = ans;
        for(int i=0; i<n; i++) {
            if((visited & 1<<i) == 0) {
                min = dist[city][i] + tsp((visited | 1<<i), i, n);
            }
            ans = Integer.min(ans, min);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(tsp(1, 0, 4));
    }

}
