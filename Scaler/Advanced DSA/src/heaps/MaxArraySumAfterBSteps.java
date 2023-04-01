package src.heaps;

import java.util.Arrays;

public class MaxArraySumAfterBSteps {

    public static void main(String[] args) {
        System.out.println(solve(new int[] {-50, 59, -80, -93, -51, -43, -35, -93, -2, 10, 18, 46, 68, -56, -7, -56, -54, -37, -57, -27, 0, 91, -40, 87, 88, 45, 11}, 7325));
    }

    public static void heapify(int[] arr, int index, int size) {
        while(index < size) {
            int maxIndex = index;
            int leftIndx = 2*index + 1;
            int rightIndx = 2*index + 2;

            if(leftIndx < size && arr[leftIndx] > arr[index]) {
                maxIndex = leftIndx;
            }
            if(rightIndx < size && arr[rightIndx] > arr[maxIndex]) {
                maxIndex = rightIndx;
            }
            if(maxIndex == index) break;
            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = temp;
            index = maxIndex;
        }
    }

    public static void heapSort(int[] arr) {
        int size = arr.length;
        int lastParentNode = size/2 - 1;
        for(int i=lastParentNode; i>=0; i--) {
            heapify(arr, i, size);
        }
        System.out.println(Arrays.toString(arr));
        for(int i=size-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public static int solve(int[] A, int B) {
        heapSort(A);
        System.out.println(Arrays.toString(A));
        int steps = 0;
        int i = 0;
        int prev = 0;
        while(steps < B) {
            if(i == A.length) break;
            else if(A[i] == 0) {
                steps = B;
                break;
            }
            else if(A[i] < 0) {
                A[i] = -1 * A[i];
                prev = i;
                steps++; i++;
            }
            else if(A[i] > 0) {
                int oddEven = (B - steps) % 2;
                if(A[i] <= A[prev]) A[i] = (oddEven == 0 ? 1 : -1) * A[i];
                else A[prev] = A[prev] * (oddEven == 0 ? 1 : -1);
                steps = B;
                break;
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(steps);
        System.out.println(i);
        if(steps != B) {
            int oddEven = (B - steps) % 2;
            A[i-1] = (oddEven == 0 ? 1 : -1) * A[i-1];
        }
        int resultSum = 0;
        for(int val: A) {
            resultSum += val;
        }
        return resultSum;
    }

}
