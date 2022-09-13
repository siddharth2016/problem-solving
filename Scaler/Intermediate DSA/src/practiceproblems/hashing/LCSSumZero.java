package practiceproblems.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LCSSumZero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<9; i++) {
            arr.add(scan.nextInt());
        }
        lszero(arr);
    }

    public static ArrayList<Integer> lszero(ArrayList<Integer> A) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        hm.put(sum,-1);
        int start = -1;
        int end = -1;
        for(int i=0;i<A.size();i++){
            sum += A.get(i);
            System.out.println("SUM - " + sum);
            if(hm.containsKey(sum)){
                int ln = i - hm.get(sum);
                System.out.println("i - " + i + "hm.get(sum) - " + hm.get(sum) + "len-" + ln);
                if(ln>max){
                    max = ln;
                    start = hm.get(sum)+1;
                    end = i;
                    System.out.println("updated--" + "len-" + ln + " start-" + start + " end-" + end);
                }
            }
            else {
                hm.put(sum, i);
            }
        }

        ArrayList<Integer> resLst = new ArrayList<>();
        if(start>=0 && end>=0){
            for (int i=start; i<=end; i++){
                resLst.add(A.get(i));
            }
        }
        return resLst;
    }

}
