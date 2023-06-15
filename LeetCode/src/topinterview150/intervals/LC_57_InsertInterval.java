package src.topinterview150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_57_InsertInterval {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(
                insert(new int[][]{
                        {1,2},{3,5},{6,7},{8,10},{12,16}
                }, new int[]{4,8})
        ));

        System.out.println(Arrays.deepToString(
                insert(new int[][]{
                        {1,3},{6,9}
                }, new int[]{2,5})
        ));

        System.out.println(Arrays.deepToString(
                insert(new int[][]{
                        {4,7}
                }, new int[]{1,2})
        ));
    }

    static class Pair {
        int x;
        int y;
        public Pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        List<Pair> tempResult = new ArrayList<>();
        Pair tempInterval = new Pair(newInterval[0], newInterval[1]);
        boolean added = false;
        while(i < intervals.length) {
            if(tempInterval.y < intervals[i][0]) {
                tempResult.add(tempInterval);
                added = true;
                break;
            }
            else if(tempInterval.x > intervals[i][1]) {
                tempResult.add(new Pair(intervals[i][0], intervals[i][1]));
            }
            else {
                tempInterval.x = Integer.min(tempInterval.x, intervals[i][0]);
                tempInterval.y = Integer.max(tempInterval.y, intervals[i][1]);
            }
            i++;
        }
        while(i < intervals.length) {
            tempResult.add(new Pair(intervals[i][0], intervals[i][1]));
            i++;
        }
        if(!added) tempResult.add(tempInterval);

        int[][] result = new int[tempResult.size()][2];
        for(int j=0; j<tempResult.size(); j++) {
            result[j][0] = tempResult.get(j).x;
            result[j][1] = tempResult.get(j).y;
        }

        return result;
    }

}
