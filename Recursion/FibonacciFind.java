package Recursion;

import java.util.Scanner;

/**
 * FibonacciFind
 */
public class FibonacciFind {
//finction definition
public static int fibFind(int n){
    if(n<=1){
        return n;
    }
    else
    {
        return fibFind(n-1)+fibFind(n-2);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find fibonacci series value");
        int n = sc.nextInt();
        //function calling
        int result = fibFind(n);
        System.out.println("The final output is "+result);
    }
}