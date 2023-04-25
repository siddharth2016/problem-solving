package src.arrays;

import java.util.ArrayList;

public class SumOfAllSubmatrices {

    public int solve(ArrayList<ArrayList<Integer>> A) {
        int ans = 0;
        int n = A.size();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                ans += A.get(i).get(j) * (i+1) * (n-i) * (j+1) * (n-j);
            }
        }
        return ans;
    }

}
