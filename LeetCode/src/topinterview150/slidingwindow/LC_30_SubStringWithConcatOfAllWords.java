package src.topinterview150.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_30_SubStringWithConcatOfAllWords {

    public static void main(String[] args) {
        System.out.println(Solution1.findSubstring("wordgoodgoodgoodbestword",
                new String[]{"word","good","best","good"}));
    }

    static class Solution1 {
        public static List<Integer> findSubstring(String s, String[] words) {
            int strLen = s.length();
            int wordLen = words[0].length();
            int totalWords = words.length;
            int subStringLen = totalWords * wordLen;
            Map<String, Integer> wordFreq = new HashMap<>();
            for(String word: words) {
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
            List<Integer> result = new ArrayList<>();

            System.out.println(wordFreq);
            System.out.println(subStringLen);
            System.out.println(strLen);
            for(int i=0; i<=strLen - subStringLen; i++) {
                System.out.println(i);
                if(check(s, i, wordLen, subStringLen, totalWords, wordFreq)) result.add(i);
            }

            return result;
        }

        public static boolean check(String s, int start, int wordLen, int subLen,
                                    int totalWords, Map<String, Integer> freq) {
            Map<String, Integer> temp = new HashMap<>();
            int countWords = 0;
            for(int i=start; i<start+subLen; i += wordLen) {
                String subWord = s.substring(i, i+wordLen);
                System.out.println(subWord);
                if(!freq.containsKey(subWord) ||
                        (temp.containsKey(subWord) &&
                                freq.get(subWord).equals(temp.get(subWord)))) return false;

                temp.put(subWord, temp.getOrDefault(subWord, 0) + 1);
                countWords++;
            }
            return countWords == totalWords;
        }
    }

}
