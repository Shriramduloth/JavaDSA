import java.util.*;
public class SumOfNumUsingRecursion {
    //function definition
    public static int findSum(int n){
        int result=0;
        if(n==0){
            return 0;
        }
        else{
            result=(n%10)+findSum(n/10);
        }
        return result;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find sum : ");
        int num = sc.nextInt();

        //function call
        int result = findSum(num);
        System.out.println("The sum of digits of number is "+result);
    }
}
