package src.topinterview150;

public class LC_42_TrappingRainwater {

    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for(int i=0; i<n; i++) {
            if(i==0) leftMax[i] = height[i];
            else leftMax[i] = Integer.max(height[i], leftMax[i-1]);
        }

        for(int i=n-1; i>=0; i--) {
            if(i==n-1) rightMax[i] = height[i];
            else rightMax[i] = Integer.max(height[i], rightMax[i+1]);
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += Integer.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }

}
