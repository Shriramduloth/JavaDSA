import java.util.Scanner;

public class SquareRoot {
    //definition of method 
    public static int FindSquareRoot(int a) {
        int low = 0, high = a;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid * mid;
            if (val == a) {
                result = mid;
                break;
            } else if (val > a) {
                high = mid - 1;
            } else {
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find out square number");
        int n = sc.nextInt();
        int result = FindSquareRoot(n);
        System.out.println("Square root of number " + n + " is " + result);
    }
}
