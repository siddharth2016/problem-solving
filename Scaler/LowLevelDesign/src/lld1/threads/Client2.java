package src.lld1.threads;

public class Client2 {

    public static void main(String[] args) {
        for (int i =0; i<100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }

}
