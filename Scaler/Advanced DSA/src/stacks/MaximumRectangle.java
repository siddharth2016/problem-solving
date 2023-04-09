package src.stacks;
import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangle {
    public static void main(String[] args) {
        System.out.println(solve(
                new int[][]{
                        {0, 1, 1},
                        {1, 0, 0},
                        {1, 0, 0},
                        {1, 0, 0},
                        {1, 0, 0},
                        {1, 1, 1},
                        {0, 1, 0}
                }
        ));
    }
    public static int[][] getPrefixSumMat(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0; i<cols; i++) {
            int sum = 0;
            for(int j=0; j<rows; j++) {
                if(mat[j][i] == 0) sum = 0;
                else sum += mat[j][i];
                result[j][i] = sum;
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }

    public static int solve(int[][] A) {
        int[][] prefixSumMat = getPrefixSumMat(A);

        int maxArea = Integer.MIN_VALUE;

        for (int[] ints : prefixSumMat) {
            maxArea = Integer.max(maxArea, getArea(ints));
        }

        return maxArea;
    }

    public static int getArea(int[] A) {
        int[] smallerLeft = getSmallerLeft(A);
        int[] smallerRight = getSmallerRight(A);
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++) {
            maxArea = Integer.max(maxArea, A[i] * (-smallerLeft[i] + smallerRight[i] - 1));
        }
        return maxArea;
    }

    public static int[] getSmallerLeft(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[A.length];
        for(int i=0; i<A.length; i++) {
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = -1;
            else result[i] = stack.peek();
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int[] getSmallerRight(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[A.length];
        for(int i=A.length-1; i>=0; i--) {
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) result[i] = A.length;
            else result[i] = stack.peek();
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
