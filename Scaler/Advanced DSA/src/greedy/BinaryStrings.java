package src.greedy;

import java.util.Arrays;

public class BinaryStrings {

    public int solve(String A, int B) {
        int n = A.length();
        int[] temp = new int[n];
        Arrays.fill(temp, 0);
        int xr = 0;
        int ans = 0;
        int i = 0;
        for (i = 0; i <= n - B; i++) {
            xr ^= temp[i];
            if ((A.charAt(i) == '0' && xr == 0) || (A.charAt(i) == '1' && xr == 1)) {
                ans++;
                if (i + B < n) {
                    temp[i + B] = 1;
                }
                xr = 1 - xr;
            }
        }
        while (i < n) {
            xr ^= temp[i];
            int val = A.charAt(i) - 48;
            if ((val ^ xr) == 0) {
                return -1;
            }
            i++;
        }
        return ans;
    }

}
