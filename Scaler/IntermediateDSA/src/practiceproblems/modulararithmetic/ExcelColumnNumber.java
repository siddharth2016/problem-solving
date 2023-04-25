package practiceproblems.modulararithmetic;

public class ExcelColumnNumber {

    public int titleToNumber(String A) {
        int result = 0;
        int pow = 1;
        int length = A.length();
        for(int i=length-1; i>=0; i--) {
            int col = A.charAt(i) - 'A' + 1;
            result += col * pow;
            pow *= 26;
        }
        return result;
    }

}
