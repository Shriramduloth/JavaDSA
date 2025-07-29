import java.util.LinkedList;
import java.util.Queue;

public class queueImpl {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//enqueue operation 
//insertion in queue
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }

        System.out.println("Queue data looks like: "+q);
        System.out.println("Top element befor deletion is : "+q.peek());

        //Deque deletion from queue

        if(q.size()==0){
            System.out.println("Queue is empty");
        }
        else
            {
                q.remove();
            }
        System.out.println("Top element after deletion is : "+q.peek());



    }
}
