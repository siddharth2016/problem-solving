package languagemodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitAnArrayNChunks {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        System.out.println(divideArray(arr, 1));
//        System.out.println(divideArray(arr, 2));
//        System.out.println(divideArray(arr, 3));
//        System.out.println(divideArray(arr, 4));
//        System.out.println(divideArray(arr, 7));
//        System.out.println(divideArray(arr, 10));

        System.out.println(Arrays.deepToString(chunkArray(arr, 1)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 2)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 3)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 4)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 7)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 10)));
    }

    public static List<List<Integer>> divideArray(int[] arr, int chunkSize) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        int count = 0;
        for (int j : arr) {
            temp.add(j);
            count++;
            if (count >= chunkSize) {
                result.add(temp);
                temp = new ArrayList<>();
                count = 0;
            }
        }

        if(temp.size() != 0) result.add(temp);
        return result;
    }

    public static int[][] chunkArray(int[] arr, int chunkSize) {
        int chunks = arr.length / chunkSize;
        if(arr.length % chunkSize > 0) chunks++;

        int[][] result = new int[chunks][];

        for(int i=0; i<chunks; i++) {
            int partitionSize = chunkSize;
            if(i == chunks - 1) partitionSize = Integer.min(partitionSize, arr.length - i * chunkSize);
            result[i] = Arrays.copyOfRange(arr, i*chunkSize, i*chunkSize + partitionSize);
        }

        return result;
    }

}
