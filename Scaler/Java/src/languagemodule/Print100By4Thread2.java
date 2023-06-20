package languagemodule;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Print100By4Thread2 {

    public static void main(String[] args) throws InterruptedException{

        final AtomicInteger counter = new AtomicInteger(0);

        while(counter.intValue() < 20) {
            System.out.println(Thread.currentThread().getName() + " : " + counter.incrementAndGet());
        }

        Runnable runnable = () -> {
            while(counter.intValue() < 70) {
                synchronized (counter) {
                    System.out.println(Thread.currentThread().getName() + " : " + counter.incrementAndGet());
                    counter.notify();
                    try {
                        counter.wait(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        List<Thread> threadList = new ArrayList<>();
        for(int i=0; i<4; i++) {
            threadList.add(new Thread(runnable));
        }
        threadList.forEach(Thread::start);
        for(Thread thread: threadList) {
            thread.join();
        }


        while(counter.intValue() < 100) {
            System.out.println(Thread.currentThread().getName() + " : " + counter.incrementAndGet());
        }
    }
}
