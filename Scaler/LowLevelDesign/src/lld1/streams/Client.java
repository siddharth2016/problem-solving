package src.lld1.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        // Lambda
        Thread thread = new Thread(() -> System.out.println("This is a thread " + Thread.currentThread().getName()));
        thread.start();
        thread.join();

        // Streams
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        list
                .stream()
                .map(x -> x * 2)
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);

        // Stream Collectors toSet
        System.out.println(list.stream()
                .map(x -> x*2)
                .collect(Collectors.toSet()));
    }

}
