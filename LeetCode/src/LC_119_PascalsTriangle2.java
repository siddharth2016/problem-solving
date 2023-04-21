package src;

import java.util.ArrayList;
import java.util.List;

public class LC_119_PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        for(int i=1; i<=rowIndex; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for(int j=0; j<prevRow.size(); j++) {
                if(j != 0) {
                    currentRow.add(prevRow.get(j) + prevRow.get(j-1));
                }
                else {
                    currentRow.add(prevRow.get(j));
                }
            }
            currentRow.add(1);
            prevRow = currentRow;
        }
        return prevRow;
    }

}
