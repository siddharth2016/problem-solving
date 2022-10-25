package src.maths;

import java.util.ArrayList;

public class RearrangeArray {

    public void arrange(ArrayList<Integer> A) {
        int n = A.size();
        A.replaceAll(integer -> integer % n + ((n - (integer - A.get(integer) % n)) % n) * n);

        A.replaceAll(integer -> ((integer - (integer % n)) / n + (integer % n)) % n);
    }

}
