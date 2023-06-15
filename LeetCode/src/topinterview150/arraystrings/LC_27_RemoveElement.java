package src.topinterview150.arraystrings;

public class LC_27_RemoveElement {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int i = nums.length;
        for(int j=nums.length-1; j>=0; j--) {
            if(nums[j] == val) {
                i--;
                swap(nums, i, j);
            }
        }
        return i;
    }

}
