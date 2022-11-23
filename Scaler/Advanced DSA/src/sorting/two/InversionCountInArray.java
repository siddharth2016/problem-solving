package src.sorting.two;

public class InversionCountInArray {

    public static void main(String[] args) {
        System.out.println(solve(new int[] {28, 18, 44, 49, 41, 14}));
    }

    private static final int mod = (int)Math.pow(10, 9) + 7;

    public static long merge(int[] arr, int[] temp, int s, int mid, int e) {
        int i = s;
        int j = mid+1;
        int k = s;
        long result = 0;

        while(i <= mid && j <= e) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++; result = (result%mod + mid%mod - i%mod + 1 + mod)%mod;
            }
            k++;
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++; k++;
        }


        while(j <= e) {
            temp[k] = arr[j];
            j++; k++;
        }

        for(i=s; i<=e; i++) {
            arr[i] = temp[i];
        }

        return result;
    }

    public static long mergeSort(int[] arr, int[] temp, int s, int e) {
        if(s >= e) return 0;
        int mid = (s + e) / 2;
        long res = 0;
        res += mergeSort(arr, temp, s, mid)%mod;
        res += mergeSort(arr, temp, mid+1, e)%mod;
        res += merge(arr, temp, s, mid, e)%mod;
        return res%mod;
    }

    public static int solve(int[] A) {
        return (int)(mergeSort(A, new int[A.length], 0, A.length-1)%mod);
    }

}
