package src.lld1.threads;

public class HelloWorldPrinter {

    public static void main(String[] args) {
        System.out.println("Hello World From + " + Thread.currentThread().getName());

        Thread thread = new Thread(
                () -> {
                    System.out.println("Hello World From + " + Thread.currentThread().getName());
                    System.out.println("Hello World Complete From + " + Thread.currentThread().getName());
                }
        );

        thread.start();

        System.out.println("Hello World Complete From + " + Thread.currentThread().getName());
    }

}