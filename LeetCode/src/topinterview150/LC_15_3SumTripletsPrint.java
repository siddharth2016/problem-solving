package src.topinterview150;

import java.util.*;

public class LC_15_3SumTripletsPrint {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Set<String> mainSet = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++) {
            if(i!=0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int target = -1 * (nums[i]);
            int start = i+1;
            int end = n-1;
            while(start < end) {
                int sum = nums[start] + nums[end];
                if(sum == target) {
                    if(!mainSet.contains(nums[i] + "@" + nums[start] + "@" + nums[end])) {
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        mainSet.add(nums[i] + "@" + nums[start] + "@" + nums[end]);
                    }
                    start++; end--;
                }
                else if(sum < target) start++;
                else end--;
            }
        }
        return result;
    }
}
