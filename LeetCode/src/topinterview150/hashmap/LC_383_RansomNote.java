package src.topinterview150.hashmap;

public class LC_383_RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countMagLetters = new int[26];
        for(char chr: magazine.toCharArray()) {
            countMagLetters[chr - 'a']++;
        }
        for(char chr: ransomNote.toCharArray()) {
            if(countMagLetters[chr - 'a'] == 0) return false;
            countMagLetters[chr - 'a']--;
        }
        return true;
    }

}
