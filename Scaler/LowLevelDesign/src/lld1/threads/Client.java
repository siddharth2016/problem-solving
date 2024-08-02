package src.lld1.threads;

public class Client {


    public static void doSomething() {
        System.out.println("doSomething! Exec by Thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Hello Client! Exec by Thread " + Thread.currentThread().getName());
        doSomething();
    }

}
