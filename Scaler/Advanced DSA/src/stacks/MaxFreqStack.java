package src.stacks;

import java.util.HashMap;
import java.util.Stack;

public class MaxFreqStack {

    int maxFreq = 0;
    int j = 0;
    public int[] solve(int[][] A) {
        HashMap<Integer, Stack<Integer>> stackMap = new HashMap<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int[] result = new int[A.length];

        for(int[] arr: A) {
            int ops = arr[0];
            int val = arr[1];

            if(ops == 1) {
                insert(stackMap, freqMap, result, val);
            }
            else {
                delete(stackMap, freqMap, result);
            }
        }

        return result;
    }

    public void insert(HashMap<Integer, Stack<Integer>> stackMap, HashMap<Integer, Integer> freqMap,
                       int[] result, int val) {
        freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        int freq = freqMap.get(val);
        if(!stackMap.containsKey(freq)) {
            stackMap.put(freq, new Stack<Integer>());
        }
        stackMap.get(freq).push(val);
        result[j++] = -1;
        maxFreq = Integer.max(maxFreq, freq);
    }

    public void delete(HashMap<Integer, Stack<Integer>> stackMap, HashMap<Integer, Integer> freqMap,
                       int[] result) {
        int val = stackMap.get(maxFreq).pop();

        if(stackMap.get(maxFreq).isEmpty()) {
            stackMap.remove(maxFreq);
            maxFreq--;
        }

        freqMap.put(val, freqMap.get(val) - 1);

        if(freqMap.get(val) == 0) {
            freqMap.remove(val);
        }

        result[j++] = val;
    }

}
