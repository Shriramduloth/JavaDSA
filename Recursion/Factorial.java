package Recursion;

import java.util.*;

public class Factorial {
    public static int factNum(int n){
        if (n==0 ||n==1) {
            return 1;
        }
        else{
            return n*factNum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to find Factorial of the number");
        int n=sc.nextInt();
        int result=factNum(n);
        System.out.println("Factorial of number is " + result);
    }
}
