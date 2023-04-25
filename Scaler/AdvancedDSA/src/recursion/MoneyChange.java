package src.recursion;

public class MoneyChange {

    static int[] coins = new int[] {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};

    public static int searchNote(int n) {
        int prev = coins[0];
        for(int elem: coins) {
            if(elem > n) return prev;
            prev = elem;
        }
        return prev;
    }

    public static int coinsNeeded(int n) {
        if(n == 0) return 0;
        int noteNeeded = searchNote(n);
        System.out.println(noteNeeded + " " + n / noteNeeded);
        return (n / noteNeeded) + coinsNeeded(n % noteNeeded);
    }

    public static void main(String[] args) {
        System.out.println(coinsNeeded(10000));
        System.out.println(coinsNeeded(120000));
        System.out.println(coinsNeeded(12345));
        System.out.println(coinsNeeded((int)Math.pow(2, 29)));
    }

}
