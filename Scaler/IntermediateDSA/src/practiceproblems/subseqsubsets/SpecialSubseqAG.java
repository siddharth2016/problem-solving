package practiceproblems.subseqsubsets;

public class SpecialSubseqAG {

    public int solve(String A) {
        int countA = 0;
        int mod = 1000000007;
        int result = 0;
        for(Character elem: A.toCharArray()) {
            if(elem == 'A') countA = (countA + 1) % mod;
            else if(elem == 'G') result = (result % mod + countA % mod) % mod;
        }
        return result;
    }

}
