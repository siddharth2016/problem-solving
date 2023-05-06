package src.problems;/* https://practice.geeksforgeeks.org/problems/wine-buying-and-selling/1 */

import java.util.Deque;
import java.util.LinkedList;

public class WineBuyingAndSelling {

    class Pair {
        int val;
        int index;
        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    long wineSelling(int Arr[],int N){
        // code here
        Deque<Pair> dq = new LinkedList<>();
        long ans = 0L;
        for(int i=0; i<N; i++) {
            if(Arr[i] > 0) {
                int buy = Arr[i];
                int j = i;
                while(dq.size() != 0 && dq.peek().val < 0 && buy > 0) {
                    Pair top = dq.removeFirst(); j = top.index;
                    ans = ans + (long)(Math.min(Math.abs(top.val), buy)) * (long)(i - top.index);
                    buy = top.val + buy;
                }
                if(buy > 0) dq.addLast(new Pair(buy, i));
                else if(buy < 0) dq.addFirst(new Pair(buy, j));
            }
            else if(Arr[i] < 0) {
                int sell = Arr[i];
                int j = i;
                while(dq.size() != 0 && dq.peek().val > 0 && sell < 0) {
                    Pair top = dq.removeFirst(); j = top.index;
                    ans = ans + (long)(Math.min(top.val, Math.abs(sell))) * (long)(i - top.index);
                    sell = top.val + sell;
                }
                if(sell > 0) dq.addFirst(new Pair(sell, j));
                else if(sell < 0) dq.addLast(new Pair(sell, i));
            }
        }
        return ans;
    }

}
