package src.greedy;

import java.util.ArrayList;

public class Seats {

    public int seats(String A) {
        ArrayList<Integer> numberOfX = new ArrayList<>();
        for(int i=0; i<A.length(); i++) {
            if(A.charAt(i) == 'x') numberOfX.add(i);
        }
        int len = numberOfX.size();
        int mid = len / 2;
        int i = 1;
        int left = mid - 1;
        int right = mid + 1;
        int mod = (int)Math.pow(10, 7) + 3;
        int result = 0;
        while(left >= 0) {
            result = (result % mod + numberOfX.get(mid) - i - numberOfX.get(left) + mod) % mod;
            left--; i++;
        }
        i = 1;
        while(right < len) {
            result = (result % mod + numberOfX.get(right) - numberOfX.get(mid) - i + mod) % mod;
            right++; i++;
        }
        return result;
    }

}
