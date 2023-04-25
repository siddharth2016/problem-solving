package src.arrays;

import java.util.ArrayList;

public class RowColSortedMatSearch {

    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int rows = A.size();
        int cols = A.get(0).size();
        int indxi = 0;
        int indxj = cols-1;

        while(indxi < rows && indxj >= 0 && A.get(indxi).get(indxj) != B) {
            if(A.get(indxi).get(indxj) < B) indxi++;
            else if(A.get(indxi).get(indxj) > B) indxj--;
        }

        if(indxi == rows || indxj < 0) return -1;

        while(indxj >=0 && A.get(indxi).get(indxj) == B) {
            indxj--;
            if(indxj < 0 || A.get(indxi).get(indxj) != B) {
                indxj++;
                break;
            }
        }

        while(indxi >= 0 && A.get(indxi).get(indxj) == B) {
            indxi--;
            if(indxi < 0 || A.get(indxi).get(indxj) != B) {
                indxi++;
                break;
            }
        }

        return (indxi + 1) * 1009 + (indxj + 1);
    }

}
