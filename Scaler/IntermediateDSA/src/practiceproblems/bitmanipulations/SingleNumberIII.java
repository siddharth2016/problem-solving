package practiceproblems.bitmanipulations;

import java.util.ArrayList;

public class SingleNumberIII {

    private int totalXor(ArrayList<Integer> A) {
        int result = 0;
        for(Integer elem:A) {
            result ^= elem;
        }
        return result;
    }

    private int nearestSetBitPos(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) == 1) break;
            n >>= 1;
            count++;
        }
        return count;
    }

    private int getFirstNum(ArrayList<Integer> A, int pos) {
        int result = 0;
        for(Integer elem:A) {
            if(((elem>>pos) & 1) == 1) result ^= elem;
        }
        return result;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int totalXor = totalXor(A);
        int firstSetBitPos = nearestSetBitPos(totalXor);
        int firstNum = getFirstNum(A, firstSetBitPos);
        int secNum = totalXor ^ firstNum;
        ArrayList<Integer> result = new ArrayList<>();
        if(firstNum > secNum) {
            result.add(secNum);
            result.add(firstNum);
        }
        else {
            result.add(firstNum);
            result.add(secNum);
        }
        return result;
    }

}
