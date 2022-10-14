package src.bitmanipulation;

public class InterestingArray {

    public String solve(int[] A) {
        int mergedElem = 0;

        for(int elem: A) {
            if(elem % 2 == 1) mergedElem ^= elem;
        }

        if(mergedElem % 2 == 0) return "Yes";
        else return "No";
    }

}
