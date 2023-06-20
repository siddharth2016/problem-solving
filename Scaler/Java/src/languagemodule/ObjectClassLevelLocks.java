package languagemodule;


class SomeClass {

    public void instanceLock() {
        synchronized (this) {
            System.out.println("Inside Instance Lock");
            System.out.println("Start Thread -- " + Thread.currentThread().getName());
            System.out.println("End Thread -- " + Thread.currentThread().getName());
        }
    }

    public void classLock() {
        synchronized (SomeClass.class) {
            System.out.println("Inside Class Lock");
            System.out.println("Start Thread -- " + Thread.currentThread().getName());
            System.out.println("End Thread --" + Thread.currentThread().getName());
        }
    }
}

public class ObjectClassLevelLocks {

    public static void main(String[] args) throws InterruptedException{
        SomeClass instance1 = new SomeClass();
        SomeClass instance2 = new SomeClass();

        Thread thread1 = new Thread(instance1::instanceLock);
        Thread thread2 = new Thread(instance2::instanceLock);
        Thread thread3 = new Thread(instance1::classLock);
        Thread thread4 = new Thread(instance2::classLock);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

//        Thread thread3 = new Thread(instance1::classLock);
//        Thread thread4 = new Thread(instance2::classLock);
//        thread3.start();
//        thread4.start();
    }

}
