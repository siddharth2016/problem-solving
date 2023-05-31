package src.topinterview150;

public class LC_28_IndexOfFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        while(j < haystack.length()) {
            int result = j;
            if(haystack.charAt(j) == needle.charAt(i)) {
                while(j < haystack.length() && haystack.charAt(j) == needle.charAt(i)) {
                    j++; i++;
                    if(i == needle.length()) return result;
                }
                i = 0;
                j = result;
            }
            j++;
        }
        return -1;
    }

}
