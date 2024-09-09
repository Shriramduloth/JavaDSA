package ComplexityAnalysis;

public class Missing {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6};
        int n = arr.length;
        int sum=0;

        int sum_of_natural = ((n+1)*(n+2))/2;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        int mis_num = sum_of_natural-sum;
        System.out.println("Missing number is "+mis_num);
    }
}
