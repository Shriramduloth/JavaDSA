import java.util.Scanner;

public class FirstOccurence {
    public static int FindFirstOccurence(int[] arr, int target) {
        int low = 0, high = target;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
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

        int result = FindFirstOccurence(arr, x);
        if (result == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("First occurence of Element is present at index " + result);
        }
    }
}
