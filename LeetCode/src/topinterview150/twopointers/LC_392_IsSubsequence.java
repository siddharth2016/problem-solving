package src.topinterview150.twopointers;

public class LC_392_IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        if(i > j) return false;

        while(i>=0 && j>=0) {
            if(s.charAt(i) == t.charAt(j)) i--;
            j--;
        }

        return i < 0;
    }

}
