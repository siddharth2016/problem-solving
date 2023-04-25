package src.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SpecialMedian {

    public int solve(ArrayList<Integer> A) {
        ArrayList<Double> LtToRt = getmedian(A);
        for(int i = 0; i < LtToRt.size()- 1 ; i++){
            if(LtToRt.get(i).equals(A.get(i + 1).doubleValue())){
                return 1;
            }
        }
        Collections.reverse(A);
        ArrayList<Double> RtToLt = getmedian(A);
        for(int i = 0; i < RtToLt.size()-1 ; i++){
            if(RtToLt.get(i).equals(A.get(i + 1).doubleValue())){
                return 1;
            }
        }
        return 0;
    }
    public ArrayList<Double> getmedian(ArrayList<Integer> A) {
        PriorityQueue<Integer> minrt = new PriorityQueue<>();
        PriorityQueue<Integer> maxlt = new PriorityQueue<>( Collections.reverseOrder());
        ArrayList<Double> ans = new ArrayList<>();

        for(int i = 0; i < A.size(); i++){
            if(i%2 == 0){
                minrt.add(A.get(i));
                maxlt.add(minrt.remove());
                ans.add((double)maxlt.peek());
            }
            else if(i%2 != 0){
                maxlt.add(A.get(i));
                minrt.add(maxlt.remove());
                ans.add((maxlt.peek() + minrt.peek())/2.0);
            }
        }
        return ans;
    }

}
