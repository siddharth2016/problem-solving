package src.lld1.threads.addersubtractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    Count count;
    Lock lock;
    int n;

    public Adder(int n, Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
        this.n = n;
    }

    @Override
    public void run() {
        for(int i=1; i<=n; i++) {
            lock.lock();
            count.value += i;
            System.out.println("Adder Count " + count.value);
            lock.unlock();
        }
    }
}
