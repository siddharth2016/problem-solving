package src.recursion;

public class ReachEndOfMatrix {


    public static int totalWaysToReach(int n, int m) {
        if(n == 0 || m == 0) return 1;
        return totalWaysToReach(n-1, m) + totalWaysToReach(n, m-1);
    }

    public static void main(String[] args) {
        System.out.println(totalWaysToReach(3, 3));
        System.out.println(totalWaysToReach(5, 3));
    }

}
