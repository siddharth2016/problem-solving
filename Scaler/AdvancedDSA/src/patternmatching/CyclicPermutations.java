package src.patternmatching;

public class CyclicPermutations {

    public int solve(String A, String B) {
        // concatenate the strings
        B = B + B;
        String p = A + "$" + B;
        int N = p.length();
        // creaing lps array
        int[] lps = new int[N];
        lps[0] = 0;
        int len = 0;
        int i = 1;
        while(i<N){
            if(p.charAt(i) == p.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0)
                    len = lps[len-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int count = 0;
        for(int j=0; j<N; j++){
            if(lps[j] == A.length() && j > 2*A.length())
                count++;
        }
        return count;
    }

}
