import java.util.*;
public class Ques2 {
    public static int findResult(int n){
        int sum=0;
        if(n<=0){
            return 0;
        }
        if(n%2==0){
            sum=findResult(n-1)-n;
        }
        else{
                sum=findResult(n-1)+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();

        int result = findResult(n);
        System.out.println(result);
    }
}
