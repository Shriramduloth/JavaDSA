
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        System.out.println("Enter target value: ");
        int target = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(array[i],i);
        }

        int[] result= {-1,-1};
        for(int i=0;i<n;i++){
            if(array[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]= map.get(0);
                break;
            }
            else if(map.containsKey(target-array[i])) {
                if(map.get(target-array[i])>i){
                    result[0]=i;
                    result[1]=map.get(target-array[i]);
                    break;
                }
                
            }
           
        }
        // System.out.println(map.get(5));
        System.out.println("Two sum index value is : ["+result[0]+","+result[1]+"]");
    }

}
