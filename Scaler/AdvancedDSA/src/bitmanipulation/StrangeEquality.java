package src.bitmanipulation;

public class StrangeEquality {

    public static void main(String[] args) {
        System.out.println(solve(1));
    }

    public static int solve(int A) {
        int pos = 1;
        int num = A;
        while(A > 0) {
            pos++;
            A = A>>1;
        }
        int nearestN = (1<<pos) - 1;
        System.out.println(nearestN);
        return (num ^ nearestN);
    }

}
