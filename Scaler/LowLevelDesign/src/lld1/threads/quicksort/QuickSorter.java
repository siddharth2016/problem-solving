package src.lld1.threads.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class QuickSorter implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService executorService;

    public QuickSorter(List<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(list.size() <= 1) return list;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        int lastIndex = list.size() - 1;
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) < list.get(lastIndex)) {
                leftArray.add(list.get(i));
            }
            else if(i != lastIndex) rightArray.add(list.get(i));
        }

        Future<List<Integer>> futureLeftSorted = executorService.submit(new QuickSorter(leftArray, executorService));
        Future<List<Integer>> futureRightSorted = executorService.submit(new QuickSorter(rightArray, executorService));

        List<Integer> leftSorted = futureLeftSorted.get();
        List<Integer> rightSorted = futureRightSorted.get();

        List<Integer> result = new ArrayList<>(leftSorted);
        result.add(list.get(lastIndex));
        result.addAll(rightSorted);
        return result;
    }
}
