package src.bitmanipulation;

public class PowerAN {

    public static void main(String[] args) {
        int a = 5;
        int n = 6;
        int result = 1;

        while(n > 0) {
            int lastBit = n & 1;
            if(lastBit == 1) {
                result *= a;
            }
            a = a*a;
            n = n>>1;
        }

        System.out.println(result);
    }

}
