//package ComplexityAnalysis;

public abstract class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3,3, 4 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("duplicate number is " + arr[i]);
                }
            }
        }
    }
}
