package src.twopointers;

public class ContainerWithMostWater {

    public int maxArea(int[] A) {
        int i = 0;
        int j = A.length-1;
        int ans = 0;
        while(i < j) {
            int height = Math.min(A[i], A[j]);
            int width = j - i;
            int area = height * width;
            if(A[i] <= A[j]) i++;
            else j--;
            ans = Math.max(ans, area);
        }
        return ans;
    }

}
