public class problem1 {
    public static void sortedArr(int arr[], int n) {
        int x = -1;
        int y = -1;
        int prev = arr[0];
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            if (prev > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
            prev=arr[i];
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8,3, 4, 6, 7,2 };
        int n = arr.length;
        sortedArr(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}