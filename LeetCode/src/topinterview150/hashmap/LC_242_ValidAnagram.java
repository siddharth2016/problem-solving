package src.topinterview150.hashmap;

public class LC_242_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] anagramMap = new int[26];
        for(char chr: s.toCharArray()) {
            anagramMap[chr - 'a']++;
        }
        for(char chr: t.toCharArray()) {
            anagramMap[chr - 'a']--;
        }
        for(int i=0; i<26; i++) {
            if(anagramMap[i] != 0) return false;
        }
        return true;
    }

}
