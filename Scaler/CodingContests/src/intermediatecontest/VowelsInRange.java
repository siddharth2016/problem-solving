package src.intermediatecontest;

import java.util.ArrayList;

public class VowelsInRange {

    public ArrayList<Integer> solve(String A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> result = new ArrayList<>();

        int[] vowelPrefix = new int[A.length()];
        int prev = 0;
        for(int i=0; i<A.length(); i++) {
            vowelPrefix[i] = prev;
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                vowelPrefix[i] += 1;
            }
            prev = vowelPrefix[i];
        }

        for(ArrayList<Integer> list: B) {
            int countVowels;
            if(list.get(0)!=0 && list.get(1)!=0) countVowels = vowelPrefix[list.get(1)] - vowelPrefix[list.get(0)-1];
            else countVowels = vowelPrefix[list.get(1)];
            result.add(countVowels);
        }

        return result;

    }

}
