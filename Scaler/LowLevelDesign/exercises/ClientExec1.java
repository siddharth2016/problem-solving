package exercises;

import java.util.*;
public class ClientExec1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        ScalerThread thread = new ScalerThread(new Adder(num1, num2));
        thread.start();
    }

}

class Adder implements Runnable {

    int num1, num2;
    public Adder(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 + num2);
    }

}