package src.lld1.threads;

public class NumberPrinter implements Runnable {

    int num;

    public NumberPrinter(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Number: " + this.num + " From Thread: " + Thread.currentThread().getName());

    }
}
