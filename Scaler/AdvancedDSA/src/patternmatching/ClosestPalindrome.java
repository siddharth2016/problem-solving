package src.patternmatching;

public class ClosestPalindrome {

    public boolean isPossible(String A) {
        int len = A.length();
        int count = 0;
        for(int i=0; i<len/2; i++) {
            int j = len - i - 1;
            if(A.charAt(i) != A.charAt(j)) {
                count++;
                if(count > 1) return false;
            }
        }
        return len % 2 != 0 || count >= 1;
    }

    public String solve(String A) {
        boolean possible = isPossible(A);
        if(possible) return "YES";
        return "NO";
    }

}
