package src.sorting.two;

import java.util.Arrays;

public class BClosestPointsToOrigin {

    public int[][] solve(int[][] A, int B) {
        Arrays.sort(A, (x, y) -> {
            double dist1 = (double)Math.sqrt((long)Math.pow(x[0], 2) + (long)Math.pow(x[1], 2));
            double dist2 = (double)Math.sqrt((long)Math.pow(y[0], 2) + (long)Math.pow(y[1], 2));
            return Double.compare(dist1, dist2);
        });
        int[][] result = new int[B][2];
        System.arraycopy(A, 0, result, 0, B);
        return result;
    }

}
