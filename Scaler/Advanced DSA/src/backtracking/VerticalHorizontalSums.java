package src.backtracking;

public class VerticalHorizontalSums {

    // kadanes algorith helps us to find the maximum value of a sub array
    public boolean isValid(int[][] B, int row, int col, int C){
        int sum = 0;
        int result = B[row][0];

        for(int i=0; i<B[0].length; i++){
            sum = sum + B[row][i];

            if(sum < 0){
                sum = 0;
            }

            result = Math.max(result, sum);
        }

        if(result > C){
            return false;
        }

        sum = 0;
        result = B[0][col];

        for(int i=0; i<B.length; i++){
            sum = sum + B[i][col];

            if(sum < 0){
                sum = 0;
            }

            result = Math.max(result, sum);
        }

        if(result > C){
            return false;
        }

        return true;
    }

    public boolean SOLVE(int[][] B, int sum, int moves, int row, int col){
        int n = B.length;
        int m = B[0].length;

        if(col == m){
            row = row + 1;
            col = 0;
        }

// base arise when we have reached the last cell
// here we need to check that the entire array B is valid or not
        if(row == n){
            boolean ans = true;

            for(int i=0; i<n; i++){
                ans = ans & isValid(B, i, 0, sum);
            }

            for(int i=0; i<m; i++){
                ans = ans & isValid(B, 0, i, sum);
            }

            return ans;
        }

        if(isValid(B, row, col, sum)){
// traversing each cell by incrementing the column value by 1
            return SOLVE(B, sum, moves, row, col+1);
        }else{
            if(moves > 0){
                B[row][col] = B[row][col] * (-1);
                moves = moves - 1;

// traversing each cell by incrementing the column value by 1
                if(SOLVE(B, sum, moves, row, col + 1)){
                    return true;
                }
                B[row][col] = B[row][col] * (-1);
                moves = moves + 1;

// traversing each cell by incrementing the column value by 1
                return SOLVE(B, sum, moves, row, col + 1);
            }else{
                return false;
            }
        }
    }

    public int solve(int A, int[][] B, int C) {
        return SOLVE(B, C, A, 0, 0) ? 1 : 0;
    }

}
