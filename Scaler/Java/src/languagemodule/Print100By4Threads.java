package languagemodule;

import java.util.ArrayList;
import java.util.List;

public class Print100By4Threads {

    public static void main(String[] args) throws InterruptedException{

        final int[] val = new int[]{0};

        List<Thread> threadList = new ArrayList<>();
        for(int i=0; i<4; i++) {
            threadList.add(new Thread(() -> {
                while(val[0] < 100) {
                    synchronized (val) {
                        System.out.println(Thread.currentThread().getName() + " : " + val[0]);
                        val[0]++;
                        val.notify();
                        try {
                            val.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException();
                        }
                    }
                }
            }));
        }

        threadList.forEach(Thread::start);
        for(Thread thread: threadList) {
            thread.join();
        }
    }

}
