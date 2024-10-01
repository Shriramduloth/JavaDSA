//package Recursion;

import java.util.*;

public class PowerOfNum {
    public static long powerFind(int a, int b) {
        long finalResult = 0, result = 0;
        if (b == 0) {
            return 1;
        } else {
            result = powerFind(a, b / 2);
            finalResult = result * result;
            if (b % 2 != 0) {
                return a * finalResult;
            } else {
                return finalResult;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = powerFind(a, b);
        System.out.println("the power of number is " + result);
    }
}
