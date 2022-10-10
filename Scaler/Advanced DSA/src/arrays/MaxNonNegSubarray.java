package src.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegSubarray {

    public static void main(String[] args) {
        Integer arr[] = new Integer[] {756898537, -1973594324, -2038664370, -184803526, 1424268980};
        System.out.println(maxset(new ArrayList<>(Arrays.asList(arr))));
    }

    static class Result {
        long sum;
        int left;
        int length;
        Result(long s, int l, int len) {
            sum = s;
            left = l;
            length = len;
        }
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int l = 0;
        int r = 0;
        long currSum = 0;
        long maxSum = Long.MIN_VALUE;
        int i = 0;
        Result ans = new Result(maxSum, l, 0);
        while(r < A.size()) {
            long val = (long)A.get(r);
            if(val < 0) {
                if(currSum > ans.sum) {
                    ans.sum = currSum;
                    ans.left = l;
                    ans.length = r-l;
                }
                else if(currSum == ans.sum) {
                    if(ans.length < r-l) {
                        ans.left = l;
                        ans.length = r-l;
                    }
                }
                currSum = 0;
                r++;
                l = r;
            }
            else {
                currSum += val;
                r++;
            }
        }

        if(currSum > ans.sum) {
            ans.sum = currSum;
            ans.left = l;
            ans.length = r-l;
        }
        else if(currSum == ans.sum) {
            if(ans.length < r-l) {
                ans.left = l;
                ans.length = r-l;
            }
        }

        for(int j=ans.left; j<ans.left + ans.length; j++) {
            result.add(A.get(j));
        }

        return result;
    }

}
