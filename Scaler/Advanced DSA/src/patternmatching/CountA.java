package src.patternmatching;

public class CountA {

    public int solve(String A) {
        int count = 0;
        int ans = 0;
        for(char chr: A.toCharArray()) {
            if(chr == 'a') {
                count++;
                ans += count;
            }
        }
        return ans;
    }

}
