
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();

        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);
        stack1.push(11);
        System.out.println("Topmost element in stack is " + stack1.peek());
        stack1.pop();
        System.out.println("topmost element in stack after deletion " + stack1.peek());

        System.out.println("Element 4 is present at "+stack1.search(4));

        System.out.println("Element 1  is present at "+stack1.search(1));

//check stack is empty or not
        System.out.println("Is stack empty : "+stack1.empty());

    }
}
