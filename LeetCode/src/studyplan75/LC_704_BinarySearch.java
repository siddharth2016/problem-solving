package src.studyplan75;

public class LC_704_BinarySearch {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                ans = mid;
                break;
            }
            if(nums[mid] > target) {
                end = mid - 1;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }

}
