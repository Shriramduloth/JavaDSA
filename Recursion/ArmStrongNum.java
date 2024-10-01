
import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int digit = 0;
        int temp = n;
        while (temp > 0) {
            digit++;
            temp /= 10;
        }
        if (n == isArmStrong(n, digit)) {
            System.out.println("yes");

        } else {
            System.out.println("No");
        }

    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            if (b % 2 == 0) {
                return power(a, b / 2) * power(a, b / 2);

            } else {
                return a * power(a, b / 2) * power(a, b / 2);
            }
        }
    }

    public static int isArmStrong(int n, int digit) {
        if (n == 0) {
            return 0;
        }
        else{
            return power(n%10,digit)+isArmStrong(n/10, digit);
        }
        
    }
}
