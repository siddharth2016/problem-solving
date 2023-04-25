package practiceproblems.carryfwd;

public class SpecialSubSeqAG {

    public int solve(String A) {
        int result = 0;
        int count = 0;
        for(char chr : A.toCharArray()) {
            if(chr == 'A') {
                count++;
            }
            else if(chr == 'G') {
                result = (result % 1000000007 + count % 1000000007) % 1000000007;
            }
        }
        return result;
    }

}
