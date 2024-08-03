package src.lld1.threads.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService executorService;

    public MergeSorter(List<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(list.size() <= 1) return list;

        int mid = list.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0; i<mid; i++) {
            leftArray.add(list.get(i));
        }
        for(int i=mid; i<list.size(); i++) {
            rightArray.add(list.get(i));
        }

        Future<List<Integer>> leftSortedFuture = executorService.submit(new MergeSorter(leftArray, executorService));
        Future<List<Integer>> rightSortedFuture = executorService.submit(new MergeSorter(rightArray, executorService));

        List<Integer> leftSorted = leftSortedFuture.get();
        List<Integer> rightSorted = rightSortedFuture.get();

        int i=0, j=0;
        List<Integer> sortedArray = new ArrayList<>();
        while(i < leftSorted.size() && j < rightSorted.size()) {
            if(leftSorted.get(i) < rightSorted.get(j)) {
                sortedArray.add(leftSorted.get(i));
                i++;
            }
            else {
                sortedArray.add(rightSorted.get(j));
                j++;
            }
        }

        while(i < leftSorted.size()) {
            sortedArray.add(leftSorted.get(i++));
        }

        while(j < rightSorted.size()) {
            sortedArray.add(rightSorted.get(j++));
        }

        return sortedArray;
    }
}
