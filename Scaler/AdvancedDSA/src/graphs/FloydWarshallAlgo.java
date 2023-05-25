package src.graphs;

public class FloydWarshallAlgo {

    public int[][] solve(int[][] A) {
        for(int k=0; k<A.length; k++) {
            for(int i=0; i<A.length; i++) {
                for(int j=0; j<A.length; j++) {
                    if(i==j || i==k || j==k) continue;
                    int edgeik = A[i][k];
                    int edgekj = A[k][j];
                    if(edgeik == -1 || edgekj == -1) continue;
                    int newWeight = edgeik + edgekj;
                    if(A[i][j] == -1 || A[i][j] > newWeight) A[i][j] = newWeight;
                }
            }
        }
        return A;
    }

}
