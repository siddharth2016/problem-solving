package src.topinterview150.intervals;

import java.util.Arrays;
import java.util.Stack;

public class LC_452_MinimumNumberOfArrowsToBurstBalloon {

    class Pair {
        int x;
        int y;
        public Pair(int a, int b) {
            x = a;
            y = b;
        }
    }

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<Pair> stack = new Stack<>();
        for(int[] point: points) {
            if(!stack.empty() && stack.peek().y >= point[0]) {
                Pair temp = stack.pop();
                temp.x = Integer.max(temp.x, point[0]);
                temp.y = Integer.min(temp.y, point[1]);
                stack.push(temp);
            }
            else stack.push(new Pair(point[0], point[1]));
        }
        return stack.size();
    }

}
