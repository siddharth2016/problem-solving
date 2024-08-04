package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ClientExec3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayCreator arrayCreator = new ArrayCreator(n);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> futureArrayCreator = executorService.submit(arrayCreator);
        System.out.println(futureArrayCreator.get());
        System.out.println(1);
        System.out.println(4);
    }

}

class ArrayCreator implements Callable<List<Integer>> {

    private int n;

    public ArrayCreator(int n) {
        this.n = n;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> array = new ArrayList<>();
        for(int i=0; i<n; i++) {
            array.add(i+1);
        }
        return array;
    }
}
