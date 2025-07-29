
import java.util.Stack;

public class QueueImplUsingStack {
    Stack<Integer> stack1 =new Stack<>();
    Stack<Integer> stack2 =new Stack<>();
    //Enqueue operation
    public void enqueue(int data)
    {
        stack1.push(data);
    }

    //Dequeue operation
    public int dequeue(){
        int ele;
        if(stack1.empty()&&stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                ele=stack1.pop();
                stack2.push(ele);
            }

        }

        ele = stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        QueueImplUsingStack q = new QueueImplUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println("Queue is : "+q);

        //dequeue 
        System.out.println("Deleted element is : "+q.dequeue());
        System.out.println("Deleted element is : "+q.dequeue());


    }
}
