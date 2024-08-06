package exercises.zeroevenodd;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class ZeroEvenOdd {

    private int n;
    private Semaphore zeroSemaphore;
    private Semaphore oddSemaphore;
    private Semaphore evenSemaphore;

    public ZeroEvenOdd(int n) {
        this.n = n;
        this.zeroSemaphore = new Semaphore(1);
        this.oddSemaphore = new Semaphore(0);
        this.evenSemaphore = new Semaphore(0);
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i=1; i<=n; i++) {
            zeroSemaphore.acquire();
            printNumber.accept(0);
            if(i % 2 == 0) evenSemaphore.release();
            else oddSemaphore.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2; i<=n; i+=2) {
            evenSemaphore.acquire();
            printNumber.accept(i);
            zeroSemaphore.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1; i<=n; i+=2) {
            oddSemaphore.acquire();
            printNumber.accept(i);
            zeroSemaphore.release();
        }
    }

}
