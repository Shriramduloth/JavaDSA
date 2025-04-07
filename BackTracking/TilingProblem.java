/**
 * TilingProblem
 */
public class TilingProblem {
    public static int GetWays(int n) {
        if(n<=3){
            return n;
        }
        return GetWays(n-1)+GetWays(n-2);
    }

    public static void main(String[] args) {
        System.out.println("For 'n=3'  || no of ways = " + GetWays(3));
        System.out.println("For 'n=4'  || no of ways = " + GetWays(4));
        System.out.println("For 'n=5'  || no of ways = " + GetWays(5));

    }
}