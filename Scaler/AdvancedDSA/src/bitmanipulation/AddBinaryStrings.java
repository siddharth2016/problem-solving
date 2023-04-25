package src.bitmanipulation;

public class AddBinaryStrings {


    public static void main(String[] args) {
        System.out.println(addBinary("1101000", "111100110"));
    }

    public static String addBinary(String A, String B) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int lenA = A.length();
        int lenB = B.length();
        int i=lenA-1;
        int j=lenB-1;
        int nextBit = 0;
        while(i>=0 || j>=0) {
            nextBit = 0;
            if(i >= 0) {
                nextBit += (A.charAt(i) - '0');
            }
            if(j >= 0) {
                nextBit += (B.charAt(j) - '0');
            }
            nextBit += carry;
            carry = nextBit / 2;
            nextBit = nextBit % 2;
            System.out.println(nextBit + " - " + ('0' - nextBit));
            result.append((char)('0' + nextBit));
            i--; j--;
        }
        if(carry == 1) result.append('1');
        result = result.reverse();
        return result.toString();
    }
}
