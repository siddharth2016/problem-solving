package src.topinterview150.arraystrings;

public class LC_88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m];
        for(int i=0; i<m; i++) {
            aux[i] = nums1[i];
        }

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n) {
            if(aux[i] <= nums2[j]) {
                nums1[k] = aux[i];
                i++;
            }
            else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m) {
            nums1[k] = aux[i];
            k++; i++;
        }

        while(j < n) {
            nums1[k] = nums2[j];
            k++; j++;
        }
    }

}
