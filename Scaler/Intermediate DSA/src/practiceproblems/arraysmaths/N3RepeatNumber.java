package practiceproblems.arraysmaths;

import java.util.List;

public class N3RepeatNumber {

    public int repeatedNumber(final List<Integer> a) {
        int len = a.size();
        if(len < 3) return a.get(0);

        int num1 = -1;
        int freq1 = 0;
        int num2 = -1;
        int freq2 = 0;
        for(int elem: a){
            if(num1 == elem) freq1++;
            else if(num2 == elem) freq2++;

            else if(freq1 == 0) {
                num1 = elem;
                freq1++;
            }
            else if(freq2 == 0) {
                num2 = elem;
                freq2++;
            }

            else {
                freq1--;
                freq2--;
            }
        }

        int count1 = 0, count2 = 0;

        for(int elem: a) {
            if(elem == num1) count1++;
            if(elem == num2) count2++;
        }

        if(count1 > Math.floor(len / 3)) return num1;
        else if(count2 > Math.floor(len / 3)) return num2;
        else return -1;
    }

}
