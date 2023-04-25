package src.twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumZero {

    public int[][] threeSum(int[] A) {
        Arrays.sort(A);
        ArrayList<ArrayList<Integer>> tempArr = new ArrayList<>();
        int i = 0;
        while(i<A.length-2) {
            int req = -A[i];
            int j = i+1;
            int k = A.length-1;
            while(j < k) {
                int val = A[j] + A[k];
                if(val == req) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(A[i]);
                    temp.add(A[j]);
                    temp.add(A[k]);
                    tempArr.add(temp);
                    int prev = k;
                    while(j < prev && A[prev] == A[k]) prev--;
                    k = prev;
                    j++;
                }
                else if(val > req) {
                    k--;
                }
                else {
                    j++;
                }
            }

            int next = i+1;
            while(next < A.length-2 && A[i] == A[next]) {
                next++;
            }
            i = next;
        }
        int[][] ans = new int[tempArr.size()][3];
        i = 0;
        for(ArrayList<Integer> temp: tempArr) {
            ans[i][0] = temp.get(0);
            ans[i][1] = temp.get(1);
            ans[i][2] = temp.get(2);
            i++;
        }
        return ans;
    }

}
