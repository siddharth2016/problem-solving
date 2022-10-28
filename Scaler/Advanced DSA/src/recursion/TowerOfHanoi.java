package src.recursion;

import java.util.ArrayList;

public class TowerOfHanoi {

    public void solveTOH(int n, int start, int mid, int dest, ArrayList<ArrayList<Integer>> result) {
        if(n == 0) return;

        solveTOH(n-1, start, dest, mid, result);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n); temp.add(start); temp.add(dest);
        result.add(temp);
        solveTOH(n-1, mid, start, dest, result);
    }

    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        solveTOH(A, 1, 2, 3, result);

        return result;
    }

}
