package src.maths.primenumbers;

import java.util.ArrayList;

public class PrimeSubsequences {

    public int solve(ArrayList<Integer> A) {
        int MOD=1000000007;
        long count=1;
        for(int i=A.size()-1;i>=0;i--){
            if(checkPrime(A.get(i))){
                count=(count<<1)%MOD;
            }
        }
        return (int)count-1;
    }

    private boolean checkPrime(int A){
        if(A==1) return false;
        for(int i=2;i*i<=A;i++){
            if(A%i==0){
                return false;
            }
        }
        return true;
    }

}
