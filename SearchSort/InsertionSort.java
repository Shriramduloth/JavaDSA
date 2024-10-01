import java.util.*;
import java.io.*;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 9, 11, 2, 66 };

        insertionSort(arr);
        System.out.println("Sorted array after insertion sort ");
        System.out.println(Arrays.toString(arr));
    }
}
