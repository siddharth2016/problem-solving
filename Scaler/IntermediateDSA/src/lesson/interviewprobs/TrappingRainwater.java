package lesson.interviewprobs;

public class TrappingRainwater {

    private int[] getLeftLargests(int[] a, int n) {
        int[] arr = new int[n];
        int currLargest = 0;
        for(int i=0; i<n; i++) {
            currLargest = Math.max(currLargest, a[i]);
            arr[i] = currLargest;
        }
        return arr;
    }

    private int[] getRightLargests(int[] a, int n) {
        int[] arr = new int[n];
        int currLargest = 0;
        for(int i=n-1; i>=0; i--) {
            currLargest = Math.max(currLargest, a[i]);
            arr[i] = currLargest;
        }
        return arr;
    }

    public int trap(int[] height) {
        int n = height.length;
        int[] leftLargests = getLeftLargests(height, n);
        int[] rightLargests = getRightLargests(height, n);
        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += Math.min(leftLargests[i], rightLargests[i]) - height[i];
        }
        return ans;
    }

}
