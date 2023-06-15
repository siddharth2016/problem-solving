package src.topinterview150;

public class LC_35_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if(target > nums[len-1]) return len;
        if(target < nums[0]) return 0;

        int start = 0;
        int end = len-1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

}
