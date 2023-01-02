package src.patternmatching;

public class SmallestPrefixString {

    public String smallestPrefix(String A, String B) {
        int N = A.length();
        String ans = "";
        ans = ans + A.charAt(0);
        int i = 1;
        while(i < N && A.charAt(i) < B.charAt(0)){
            ans = ans + A.charAt(i);
            i++;
        }
        ans = ans + B.charAt(0);
        return ans;
    }

}
