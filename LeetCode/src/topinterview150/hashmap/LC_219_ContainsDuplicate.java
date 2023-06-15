package src.topinterview150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class LC_219_ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{2, 2}, 3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0) return false;

        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while(j<nums.length && j<=k) {
            if(set.contains(nums[j])) return true;
            set.add(nums[j]);
            j++;
        }

        while(j<nums.length) {
            set.remove(nums[i]);
            if(set.contains(nums[j])) return true;
            set.add(nums[j]);
            i++; j++;
        }

        return false;
    }

}
