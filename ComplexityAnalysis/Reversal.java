package ComplexityAnalysis;

public class Reversal {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3};

        int n =arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
