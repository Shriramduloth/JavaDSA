//package SearchSort;
import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int result = -1;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
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

        int result = binarySearch(arr, x);
        if (result != -1) {
            System.out.println("Elemnt " + x + " is found at location " + result);
        } else {
            System.out.println("Element not found");
        }

    }
}
