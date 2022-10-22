package src.gfg;

/*
    NOT COMPLETED
 */

import java.util.ArrayList;

public class MakeArrayEqual {


    public static void main(String[] args) {
        System.out.println(solve(3, new int[]{2, 0, 3}));
    }

    public static ArrayList<ArrayList<Integer>> solve(int N, int A[]){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        for(int elem: A) {
            min = Integer.min(min, elem);
        }
        if(min <= 1) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            temp.add(A.length);
            result.add(temp);
        }
        else {
            for(int i=0; i<40; i++) {
                int tempMin = Integer.MAX_VALUE;
                if(min <= 1) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(1);
                    temp.add(A.length);
                    result.add(temp);
                    break;
                }
                for(int j=0; j<A.length; j++) {
                    A[j] = A[j] % min;
                    tempMin = Integer.min(tempMin, A[j]);
                }
                min = tempMin;
            }
        }
        return result;
    }

}
