package src.backtracking;

import java.util.ArrayList;

public class NQueens {

    ArrayList<ArrayList<String>> boards;
    public ArrayList<ArrayList<String>> solveNQueens(int A) {
        boards = new ArrayList<>();
        ArrayList<String> grid = new ArrayList<>();
        for(int i=0; i<A; i++) {
            grid.add(".".repeat(A));
        }
        buildNQueensBoard(grid, 0, A);
        return boards;
    }

    public boolean isSafe(ArrayList<String> grid, int i, int j, int N) {
        for(int x=0; x<i; x++) {
            if(grid.get(x).charAt(j) == 'Q') return false;
        }

        int x = i - 1;
        int y = j - 1;
        while(x>=0 && y>=0) {
            if(grid.get(x).charAt(y) == 'Q') return false;
            x--; y--;
        }

        x = i-1;
        y = j+1;
        while(x>=0 && y<N) {
            if(grid.get(x).charAt(y) == 'Q') return false;
            x--; y++;
        }

        return true;
    }

    public void buildNQueensBoard(ArrayList<String> grid, int row, int N) {
        if(row == N) {
            boards.add(new ArrayList<>(grid));
            return;
        }

        for(int i=0; i<N; i++) {
            StringBuilder str = new StringBuilder(grid.get(row));
            if(isSafe(grid, row, i, N)) {
                str.setCharAt(i, 'Q');
                grid.set(row, str.toString());

                buildNQueensBoard(grid, row+1, N);

                str.setCharAt(i, '.');
                grid.set(row, str.toString());
            }
        }
    }

}
