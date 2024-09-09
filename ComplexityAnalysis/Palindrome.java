package ComplexityAnalysis;

public class Palindrome {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        // int arr2[] = new int[5];
        int n = arr.length;
        int flag =0;
        // for (int i = 0; i < n; i++) {
        //     arr2[n - i - 1] = arr[i];
        // }


        for (int i = 0; i < n/2; i++) {

            if (arr[i] != arr[n-1-i]) {
                flag=1;
                System.out.println("Not a Palindrome");
                break;
            } 
            
        }
        if(flag ==0){
            System.out.println("It is a Palindrome");
        }
        
        
    }
}
