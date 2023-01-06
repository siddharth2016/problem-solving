package src.hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class ColorfulNumber {

    public int colorful(int A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(A>0){
            int a = A%10;
            arr.add(a);
            A /= 10;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< arr.size(); i++){
            int prod = 1;
            for(int j = i; j < arr.size(); j++){
                prod *= arr.get(j);
                if(set.contains(prod)){
                    return 0;
                }else{
                    set.add(prod);
                }
            }
        }
        return 1;
    }

}
