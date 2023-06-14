package src.topinterview150;

import java.util.HashSet;
import java.util.Set;

public class LC_202_HappyNumber {

    public boolean isHappy(int n) {
        long sum = n;
        Set<Long> set = new HashSet<>();
        while(sum != 1) {
            long digitSqrSum = getDigitSqrSum(sum);
            if(set.contains(digitSqrSum)) {
                sum = digitSqrSum;
                break;
            }
            set.add(sum);
            sum = digitSqrSum;
        }
        return sum == 1;
    }

    public long getDigitSqrSum(long val) {
        long result = 0L;
        while(val > 0) {
            result += (long)Math.pow(val%10, 2);
            val = val/10;
        }
        return result;
    }

}
