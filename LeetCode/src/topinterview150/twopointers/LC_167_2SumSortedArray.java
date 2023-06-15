package src.topinterview150.twopointers;

public class LC_167_2SumSortedArray {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start < end) {
            int val = numbers[start] + numbers[end];
            if(val == target) {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }
            if(val > target) end--;
            else start++;
        }
        return result;
    }

}
