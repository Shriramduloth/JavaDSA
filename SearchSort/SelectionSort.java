import java.util.*;
import java.io.*;

public class SelectionSort {
    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            if (i!=min) {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;

                
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 45, 23, 12, 56, 4 };

        selectionSort(arr);
        System.out.println("Sorted array after selection sort");
        System.out.println(Arrays.toString(arr));
    }
}
