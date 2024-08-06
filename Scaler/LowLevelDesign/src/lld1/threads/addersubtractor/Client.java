package src.lld1.threads.addersubtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Count count = new Count();
        Adder adder = new Adder(100, count, lock);
        Subtractor subtractor = new Subtractor(10, count, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
//        lock.lock();
        System.out.println("Final Count " + count.value);
//        lock.unlock();
    }

}

class Count {
    int value = 0;
}