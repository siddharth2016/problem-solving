package src.topinterview150.arraystrings;

public class LC_26_RemoveDuplicatesFromSortedArray {

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int removeDuplicates(int[] nums) {
        int i = -1;
        int prev = -200;
        for(int j=0; j<nums.length; j++) {
            if(i == -1 || prev != nums[j]) {
                i++;
                swap(nums, i, j);
                prev = nums[i];
            }
        }
        return i+1;
    }

    public int removeDuplicatesUsingAuxArray(int[] nums) {
        int[] aux = new int[201];
        for(int val: nums) {
            aux[100 - val] = 1;
        }
        int j = 0;
        for(int i=-100; i<=100; i++) {
            if(aux[100 - i] == 1) nums[j++] = i;
        }
        return j;
    }

}
