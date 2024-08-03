package src.lld1.threads.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> list = List.of(10, 6, 1, 3, 9, 2, 5, 4, 7, 8);

        Future<List<Integer>> result = executorService.submit(new MergeSorter(list, executorService));

        System.out.println(result.get());
    }

}
