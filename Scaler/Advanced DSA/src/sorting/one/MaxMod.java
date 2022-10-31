package src.sorting.one;

import java.util.ArrayList;

public class MaxMod {

    public int solve(ArrayList<Integer> A) {
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int elem: A) {
            if(elem > fl) {
                sl = fl;
                fl = elem;
            }
            else if(elem > sl && elem != fl) {
                sl = elem;
            }
        }

        if(sl == Integer.MIN_VALUE) return 0;
        return sl % fl;
    }

}
