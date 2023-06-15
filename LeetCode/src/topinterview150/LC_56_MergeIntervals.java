package src.topinterview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_56_MergeIntervals {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(
                new int[][]{
                        {1, 4}, {2, 3}
                }
        )));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        List<List<Integer>> resultTemp = new ArrayList<>();
        int i = 0;
        int j;
        int[] first;
        while(i < intervals.length) {
            first = intervals[i];
            j = i;

            while(j < intervals.length) {
                if(first[1] < intervals[j][0]) break;
                first[1] = Integer.max(first[1], intervals[j][1]);
                j++;
            }

            List<Integer> temp = new ArrayList<>();
            temp.add(first[0]);
            temp.add(first[1]);
            resultTemp.add(temp);

            i = j;
        }

        int[][] result = new int[resultTemp.size()][2];
        for(int k=0; k<resultTemp.size(); k++) {
            result[k][0] = resultTemp.get(k).get(0);
            result[k][1] = resultTemp.get(k).get(1);
        }
        return result;
    }

}
