package src.topinterview150.arraystrings;

public class LC_151_ReverseWordsInAString {

    public static void main(String[] args) {
        System.out.println(reverseWords("  a good   day "));
    }

    public static void reverse(char[] arr, int i, int j) {
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

    public static String reverseWords(String s) {
        String newString = s.trim();
        char[] strArray = newString.toCharArray();
        reverse(strArray, 0, strArray.length-1);
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(j < strArray.length) {
            if(strArray[j] == ' ') {
                reverse(strArray, i, j-1);
                i = j+1;
            }
            j++;
        }
        reverse(strArray, i, j-1);
        j = 0;
        while(j < strArray.length) {
            if(strArray[j] == ' ') {
                i = j;
                sb.append(' ');
                while(i < strArray.length && strArray[i] == ' ') {
                    i++;
                }
                j = i;
            }
            sb.append(strArray[j]);
            j++;
        }
        return sb.toString();
    }

}
