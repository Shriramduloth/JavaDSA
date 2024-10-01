package SearchSort;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int x) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arrray");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search elemnt");
        int x = sc.nextInt();

        int result = linearSearch(arr, x);
        if(result!=-1){
            System.out.println("Elemnt "+x+" is found at location "+result);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
