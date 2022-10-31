package src.sorting.one;

import java.util.List;

public class KthSmallestElement {

    public int kthsmallest(final List<Integer> A, int B) {
        int[] arr = new int[A.size()];
        for(int i=0; i<A.size(); i++) {
            arr[i] = A.get(i);
        }

        for(int i=0; i<B; i++) {
            int smallest = i;
            for(int j=i+1; j<A.size(); j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        return arr[B-1];
    }

}
