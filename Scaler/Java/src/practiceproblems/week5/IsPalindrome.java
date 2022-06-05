package practiceproblems.week5;

public class IsPalindrome {

    public int isPalindrome(int A) {
        if(A<0) return 0;
        int rev = 0;
        int temp = A;
        while(A>0) {
            rev = rev * 10 + A % 10;
            A = A / 10;
        }
        if(rev == temp) return 1;
        else return 0;
    }

}
