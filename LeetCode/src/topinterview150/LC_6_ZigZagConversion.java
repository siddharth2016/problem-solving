package src.topinterview150;

public class LC_6_ZigZagConversion {

    public static void main(String[] args) {
        System.out.println(convert("PAYPAL,IS,HIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<numRows; i++) {
            int j = i;
            if(i == numRows - 1 || i == 0) {
                while(j < s.length()) {
                    sb.append(s.charAt(j));
                    j += (numRows - 1) * 2;
                }
            }
            else {
                int alternative = 0;
                while(j < s.length()) {
                    sb.append(s.charAt(j));
                    if(alternative == 0) {
                        j += (numRows - 1 - i) * 2;
                        alternative = 1;
                    }
                    else {
                        j += i * 2;
                        alternative = 0;
                    }
                }
            }
        }

        return sb.toString();
    }

}
