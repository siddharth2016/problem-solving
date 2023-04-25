package practiceproblems.modulararithmetic;

public class ModString {

    public int findMod(String A, int B) {
        int length = A.length() - 1;
        long pow = 1;
        long result = 0;
        for(int i=length; i>=0; i--) {
            long val = A.charAt(i) - '0';
            long tempVal = ((val % B) * pow) % B;
            result = ((result % B) + tempVal) % B;
            pow = ((pow % B) * 10) % B;
        }
        return (int)(result % B);
    }

}
