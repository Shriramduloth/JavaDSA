package ComplexityAnalysis;

import java.util.*;
import java.io.*;


public class pefixProblem {
    static void solve(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0;
        for (int i = r1; i <=r2; i++) {
            for (int j = c1; j <=c2; j++) {
                  sum += arr[i][j];
            }
        }
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        int arr[][] ={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
        };
        int r1,r2,c1,c2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r1 :");
        r1= sc.nextInt();
        System.out.print("Enter the value of c1 :");
        c1= sc.nextInt();
        System.out.print("Enter the value of r2 :");
        r2= sc.nextInt();
        System.out.print("Enter the value of c2 :");
        c2= sc.nextInt();


        solve(arr,r1,c1,r2,c2);
    }
}
