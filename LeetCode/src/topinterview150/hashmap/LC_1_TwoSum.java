package src.topinterview150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC_1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(target - val)) {
                result[0] = map.get(target - val);
                result[1] = i;
                break;
            }
            map.put(val, i);
        }
        return result;
    }

}
