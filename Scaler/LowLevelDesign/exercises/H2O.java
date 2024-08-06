package exercises;

import java.util.concurrent.Semaphore;

public class H2O {

    Semaphore hydrogenSemaphore;
    Semaphore oxygenSemaphore;

    public H2O() {
        this.hydrogenSemaphore = new Semaphore(2);
        this.oxygenSemaphore = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        hydrogenSemaphore.acquire();
        releaseHydrogen.run();
        if(hydrogenSemaphore.availablePermits() == 0) {
            oxygenSemaphore.release();
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        oxygenSemaphore.acquire();
        releaseOxygen.run();
        hydrogenSemaphore.release(2);
    }
}