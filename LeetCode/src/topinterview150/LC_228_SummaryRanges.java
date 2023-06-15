package src.topinterview150;

import java.util.ArrayList;
import java.util.List;

public class LC_228_SummaryRanges {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{
                0, 1, 2, 4, 5, 7
        }));
    }

    public static List<String> summaryRanges(int[] nums) {
        int i = 0;
        int j;
        int first;
        int second = 0;
        List<String> result = new ArrayList<>();
        while(i < nums.length) {
            first = nums[i];
            j = i;
            while(j < nums.length) {
                if(j!=i && Math.abs(nums[j] - nums[j-1]) > 1) break;
                second = nums[j];
                j++;
            }
            if(first == second) result.add(String.valueOf(first));
            else result.add(first + "->" + second);
            i = j;
        }
        return result;
    }

}
