package practiceproblems.bitmanipulations;

public class AddBinaryStrings {

    private int intValue(char chr) {
        return chr - '0';
    }

    public String addBinary(String A, String B) {
        int i = A.length()-1;
        int j = B.length()-1;
        int carry = 0;
        String result = "";
        while(i>=0 || j>=0 || carry!=0) {
            int d1=0, d2=0;
            if(i>=0) d1 = intValue(A.charAt(i));
            if(j>=0) d2 = intValue(B.charAt(j));
            int sumd1d2Carry = d1 + d2 + carry;
            int newDigit = sumd1d2Carry % 2;
            carry = sumd1d2Carry / 2;
            result = "" + newDigit + result;
            i--; j--;
        }
        return result;
    }

}
