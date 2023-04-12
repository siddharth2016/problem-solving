package src.backtracking;

import java.util.ArrayList;

public class SudokuSolver {

    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        buildSudoku(a, 0, 0);
    }

    public boolean isSafe(ArrayList<ArrayList<Character>> grid, int i, int j, int num) {
        for(int x=0; x<9; x++) {
            if(grid.get(i).get(x) == (char)(num+48) || grid.get(x).get(j) == (char)(num+48)) return false;
        }

        int x = (i/3)*3;
        int y = (j/3)*3;
        for(int r=x; r<x+3; r++) {
            for(int c=y; c<y+3; c++) {
                if(grid.get(r).get(c) == (char)(num+48)) return false;
            }
        }

        return true;
    }

    public boolean buildSudoku(ArrayList<ArrayList<Character>> grid, int i, int j) {
        if(i == 9) {
            return true;
        }
        if(j == 9) {
            return buildSudoku(grid, i+1, 0);
        }
        if(grid.get(i).get(j) != '.') {
            return buildSudoku(grid, i, j+1);
        }
        for(int num=1; num<10; num++) {
            if(isSafe(grid, i, j, num)) {
                grid.get(i).set(j, (char)(num + 48));
                boolean success = buildSudoku(grid, i, j+1);
                if(success) return success;
            }
        }
        grid.get(i).set(j, '.');
        return false;
    }

}
