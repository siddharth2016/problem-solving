package src.topinterview150;

public class LC_80_RemoveDuplicatesFromSortedArray2 {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int removeDuplicates(int[] nums) {
        int i=-1;
        for(int j=0; j<nums.length; j++) {
            if(i == -1 || nums[i] != nums[j]) {
                i++;
                swap(nums, i, j);
            }
            else if(i == 0 || nums[i] != nums[i-1]) {
                i++;
                swap(nums, i, j);
            }
        }
        return i+1;
    }

}
