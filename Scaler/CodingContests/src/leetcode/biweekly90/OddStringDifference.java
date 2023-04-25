package src.leetcode.biweekly90;

public class OddStringDifference {

    class Solution {

        public int[][] createDiff(String[] words) {
            int strlen = words[0].length();
            int len = words.length;

            int[][] result = new int[len][strlen-1];

            for(int i=0; i<len; i++) {
                String temp = words[i];
                int[] diffarr = new int[strlen - 1];
                for(int j=1; j<strlen; j++) {
                    int diff = temp.charAt(j) - temp.charAt(j-1);
                    diffarr[j-1] = diff;
                }
                result[i] = diffarr;
            }

            return result;
        }

        public int findDiffArray(int[][] diff) {
            int len = diff.length;
            int difflen = diff[0].length;
            int indx = 0;
            boolean found = false;
            for(int i=0; i<difflen; i++) {
                for(int j=1; j<len-1; j++) {
                    if(diff[j-1][i] != diff[j][i] && diff[j][i] == diff[j+1][i]) {
                        indx = j-1;
                        found = true;
                        break;
                    }
                    if(diff[j-1][i] == diff[j][i] && diff[j][i] != diff[j+1][i]) {
                        indx = j+1;
                        found = true;
                        break;
                    }
                    if(diff[j-1][i] == diff[j+1][i] && diff[j][i] != diff[j+1][i]) {
                        indx = j;
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }

            return indx;
        }

        public String oddString(String[] words) {
            int[][] difference = createDiff(words);
            int indx = findDiffArray(difference);
            return words[indx];
        }
    }

}
