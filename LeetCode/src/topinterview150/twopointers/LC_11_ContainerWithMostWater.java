package src.topinterview150.twopointers;

public class LC_11_ContainerWithMostWater {

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int ans = Integer.MIN_VALUE;
        while(start < end) {
            ans = Integer.max(ans, Integer.min(height[start], height[end]) * (end-start));
            if(height[start] < height[end]) start++;
            else end--;
        }
        return ans;
    }

}
