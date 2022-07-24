package practiceproblems.bitmanipulations;

import java.util.List;

public class SingleNumber {

    public int singleNumber(final List<Integer> A) {
        int single = 0;
        for(int num: A) {
            single ^= num;
        }
        return single;
    }

}
