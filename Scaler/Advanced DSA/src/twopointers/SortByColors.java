package src.twopointers;

public class SortByColors {

    public int[] sortColors(int[] A) {
        int ones = 0;
        int zeros = 0;
        int twos = 0;
        for(int val: A) {
            if(val == 0) zeros++;
            else if(val == 1) ones++;
            else twos++;
        }
        int[] ans = new int[A.length];
        for(int i=0; i<A.length; i++) {
            if(zeros != 0) {
                ans[i] = 0;
                zeros--;
            }
            else if(ones != 0) {
                ans[i] = 1;
                ones--;
            }
            else {
                ans[i] = 2;
                twos--;
            }
        }
        return ans;
    }

}
