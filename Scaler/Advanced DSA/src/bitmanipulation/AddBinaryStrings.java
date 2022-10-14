package src.bitmanipulation;

public class AddBinaryStrings {

    public String addBinary(String A, String B) {
        StringBuilder result = new StringBuilder();

        char currCarry = '0';
        char nextCarry = '0';
        int lenA = A.length();
        int lenB = B.length();
        int i=lenA-1;
        int j=lenB-1;
        char nextBit = '0';
        while(i>=0 || j>=0) {
            if(i<0) {
                nextBit = B.charAt(j);
                nextCarry = '0';
                if(nextBit == '0' && currCarry == '1') {
                    nextBit = '1';
                    nextCarry = '0';
                }
                else if(nextBit == '1' && currCarry == '1') {
                    nextBit = '0';
                    nextCarry = '1';
                }
            }
            else if(j<0) {
                nextBit = A.charAt(i);
                nextCarry = '0';
                if(nextBit == '0' && currCarry == '1') {
                    nextBit = '1';
                    nextCarry = '0';
                }
                else if(nextBit == '1' && currCarry == '1') {
                    nextBit = '0';
                    nextCarry = '1';
                }
            }
            else if(A.charAt(i) == '1' && B.charAt(j) == '1') {
                nextBit = '0';
                nextCarry = '1';
                if(currCarry == '1') nextBit = '1';
            }
            else if(A.charAt(i) == '1' || B.charAt(j) == '1') {
                nextBit = '1';
                nextCarry = '0';
                if(currCarry == '1') {
                    nextBit = '0';
                    nextCarry = '1';
                }
            }
            else {
                nextBit = '0';
                nextCarry = '0';
                if(currCarry == '1') nextBit = '1';
            }
            result.append(nextBit);
            currCarry = nextCarry;
            i--; j--;
        }
        if(currCarry == '1') result.append(currCarry);
        result = result.reverse();
        return result.toString();
    }

}
