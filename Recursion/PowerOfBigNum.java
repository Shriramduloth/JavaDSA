import java.util.Scanner;
import java.math.*;

class PowerOfBigNum{
    public static BigInteger powerNum(BigInteger a , int b){
        BigInteger finalresult,result;
        if (b==1) {
            return a;
        }
        else{
            result =powerNum(a, b/2);
            finalresult =result.multiply(result);
        }
        return finalresult;

    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number ");
        BigInteger a=sc.nextBigInteger();
        System.out.println("Enter the power of number");
        int b = sc.nextInt();

        BigInteger result=powerNum(a,b);
        System.out.println("The result is "+result);
    }
}