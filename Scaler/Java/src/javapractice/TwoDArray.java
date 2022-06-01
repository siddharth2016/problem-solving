package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void print2DArray(int[][] array) {
//        for(int i=0; i<array.length; i++) {
//            for(int j=0; j<array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int i=0; i< array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void createJaggedArray() {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int[][] arr = new int[rows][];

        for(int i=0; i<rows; i++) {
            System.out.println("Enter Number of cols for row " + i);
            int col = scan.nextInt();
            int[] colArr = new int[col];
            for(int j=0; j<col; j++) {
                colArr[j] = scan.nextInt();
            }
            arr[i] = colArr;
        }

        print2DArray(arr);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,10}, {4,5,6}, {7,8,9,11,13}};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);
        print2DArray(arr);
        createJaggedArray();
    }
}
