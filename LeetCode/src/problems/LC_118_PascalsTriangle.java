package src.problems;

import java.util.ArrayList;
import java.util.List;

public class LC_118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<numRows; j++) {
                if(i == j) {
                    temp.add(1);
                    break;
                }
                else if(j == 0) temp.add(1);
                else {
                    temp.add(pascalTriangle.get(i-1).get(j) + pascalTriangle.get(i-1).get(j-1));
                }
            }
            pascalTriangle.add(temp);
        }
        return pascalTriangle;
    }

}
