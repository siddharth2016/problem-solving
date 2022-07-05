package practiceproblems.carryfwd;

public class AmazingSubarrays {

    public int solve(String A) {
        int amazeSubs = 0;
        int n = A.length();
        String temp = A.toLowerCase();
        for(int i=0; i<n; i++) {
            char chr = temp.charAt(i);
            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                amazeSubs = (amazeSubs % 10003 + n % 10003 - i % 10003) % 10003;
            }
        }
        return amazeSubs;
    }

}
