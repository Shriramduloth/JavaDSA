
import java.util.LinkedList;
import java.util.Queue;

public class stackImpUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //Inserting element in stack using queue
    public void insert(int data){
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public int remove(){
        int ele = q1.peek();
        q1.poll();
        return ele;
    }



    public static void main(String[] args) {
        stackImpUsingQueue s = new stackImpUsingQueue();
        s.insert(2);
        s.insert(5);
        s.insert(11);
        s.insert(22);

        System.out.println("Stack looks like "+s.q1);

        //Deletion

        System.out.println("Deleted element from stack is "+s.remove());
        System.out.println("Deleted element from stack is "+s.remove());

    }
}
