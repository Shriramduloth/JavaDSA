import java.util.Scanner;

public class SumOfArray {
    public static int sumArray(int []arr,int n,int i){
        int sum =0;
        if(i==n-1){
            return arr[n-1];
        }
        else{
            sum=arr[i]+sumArray(arr, n, i+1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr={92,23,15,-20,10};
        int n=arr.length;
        int sum = sumArray(arr,n,0);
        System.out.println("Sum of elements of array is "+sum);
    }
}
