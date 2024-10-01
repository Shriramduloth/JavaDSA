public class MaxNumArray {
    public static int findHighNum(int[] arr, int n, int i) {
        int max = 0;
        if (i == n - 1) {
            return arr[n - 1];
        } else {
            int maxofIndices = findHighNum(arr, n, i + 1);
            max = Math.max(arr[i], maxofIndices);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 13, 1, -3, 22, 5 };
        int n = arr.length;
        int maxValueNum = findHighNum(arr, n, 0);
        System.out.println("Maximum value number is " + maxValueNum);
    }
}
