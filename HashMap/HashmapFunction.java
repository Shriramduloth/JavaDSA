
import java.util.HashMap;
import java.util.Map;

public class HashmapFunction {

    public static void main(String[] args) {
        HashMap<Integer,String> hashmap =new HashMap<>();
        hashmap.put(1, "Ram");
        hashmap.put(2, "Shyam");
        hashmap.put(3, "Mohan");

        System.out.println("HashMap data is "+hashmap);

        String result= hashmap.get(2);
        System.out.println(result);

        System.out.println(hashmap.containsKey(3));

        hashmap.remove(1);
        System.out.println("Updated hashmap is "+hashmap);
        System.out.println("Hashmap using entrySet is : ");
        for (Map.Entry<Integer,String> e : hashmap.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}