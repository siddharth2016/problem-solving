package practiceproblems.sorting;

import java.util.ArrayList;

public class SortByColor {

    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int elem: A) {
            if(elem == 0) count0++;
            else if(elem == 1) count1++;
            else count2++;
        }

        for(int i=0; i<count0; i++) {
            A.set(i, 0);
        }
        for(int i=count0; i<count0+count1; i++) {
            A.set(i, 1);
        }
        for(int i=count0+count1; i<A.size(); i++) {
            A.set(i, 2);
        }

        return A;
    }

}
