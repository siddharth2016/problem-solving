package src.topinterview150;

public class LC_14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int minLen = 300;
        String prefix = "";
        for(String val: strs) {
            minLen = Integer.min(minLen, val.length());
            if(minLen == val.length()) prefix = val;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<minLen; i++) {
            for(String val: strs) {
                if(prefix.charAt(i) != val.charAt(i)) return sb.toString();
            }
            sb.append(prefix.charAt(i));
        }
        return sb.toString();
    }

}
