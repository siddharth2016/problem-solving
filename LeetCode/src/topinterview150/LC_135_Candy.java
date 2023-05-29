package src.topinterview150;

import java.util.Arrays;

public class LC_135_Candy {

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] leftCandies = new int[n];
        int[] rightCandies = new int[n];
        Arrays.fill(leftCandies, 1);
        Arrays.fill(rightCandies, 1);
        for(int i=1; i<n; i++) {
            if(ratings[i] > ratings[i-1]) leftCandies[i] = leftCandies[i-1] + 1;
        }

        for(int i=n-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1]) rightCandies[i] = rightCandies[i+1] + 1;
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += Integer.max(leftCandies[i], rightCandies[i]);
        }

        return ans;
    }

}
