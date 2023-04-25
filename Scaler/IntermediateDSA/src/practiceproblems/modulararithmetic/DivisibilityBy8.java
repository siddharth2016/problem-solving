package practiceproblems.modulararithmetic;

public class DivisibilityBy8 {

    public int solve(String A) {
        int length = A.length();
        int i = length - 1;
        int num = 0;
        int pow = 1;
        while(i>=0 && i>=length-4) {
            num += (A.charAt(i) - '0') * pow;
            pow *= 10;
            i--;
        }
        return num % 8 == 0 ? 1 : 0;
    }

}
