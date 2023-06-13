package src.topinterview150;

public class LC_205_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] alpha1 = new int[256];
        int[] alpha2 = new int[256];
        int count = 1;
        for(int i=0; i<s.length(); i++) {
            if(alpha1[s.charAt(i)] != alpha2[t.charAt(i)]) return false;

            alpha1[s.charAt(i)] = count;
            alpha2[t.charAt(i)] = count;
            count++;
        }
        return true;
    }

}
