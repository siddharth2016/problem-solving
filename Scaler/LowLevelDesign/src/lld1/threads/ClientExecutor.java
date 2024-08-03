package src.lld1.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0; i<100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
    }

}
