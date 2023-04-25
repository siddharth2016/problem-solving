package src.recursion;

public class WaysToGoParty {

    public static int noOfWays(int n) {
        if(n <= 2) return n;
        return noOfWays(n-1) + (n-1) * noOfWays(n-2);
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(10));
    }

}
