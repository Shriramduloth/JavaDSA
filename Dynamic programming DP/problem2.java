public class problem2 {
    public static void sortedArr(int arr[], int n) {
        int pIndex = 0;
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
               int temp=arr[i];
               arr[i]=arr[pIndex];
               arr[pIndex]=temp;
               pIndex++;
            }
            
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 8,-3, 4, -6, 7,-2 };
        int n = arr.length;
        sortedArr(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}