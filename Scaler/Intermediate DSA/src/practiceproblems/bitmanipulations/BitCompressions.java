package practiceproblems.bitmanipulations;

import java.util.ArrayList;

public class BitCompressions {

    public int compressBits(ArrayList<Integer> A) {
        int result = 0;
        for(Integer elem:A) {
            result ^= elem;
        }
        return result;
    }

}
