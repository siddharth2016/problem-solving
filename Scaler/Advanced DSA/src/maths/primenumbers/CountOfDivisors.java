package src.maths.primenumbers;

import java.util.ArrayList;

public class CountOfDivisors {

    public int countDivisors(int num) {
        int count = 0;
        for(int i=1; i * i <= num; i++) {
            if(i * i == num) count++;
            else if(num % i == 0) count += 2;
        }
        return count;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int elem: A) {
            result.add(countDivisors(elem));
        }
        return result;
    }

}
