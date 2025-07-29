public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

    }

    // Insert at the end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // Insert data at beginning
    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // Insert at any point
    public void insertAtAny(Node prev_Node, int newData) {
        if (prev_Node == null) {
            System.out.println("the previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_Node.next;
        prev_Node.next = newNode;
    }

    // Deletion of node in linkedlist
    void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;

        // deletion at beginning
        if (position == 0) {
            head = temp.next;
            return;
        }

        // deletion at any postion
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
            if (temp == null && temp.next == null) {
                return;
            }
        }
        temp.next = temp.next.next;
    }

    // Diplay function to show linked list
    public void displayll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    //Implementation of middle of alinked list
    public void middleNode(){
        Node slow=head,fast=head;
        while(fast!=null &&fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        System.out.println("Middle node of a linked list is: "+slow.data);
    }

    // Implementation of reverse a linked list
    public void reversell() {
        Node curr = head;
        Node prev = null;
        Node nextPtr = null;

        while (curr != null) {
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        head = prev;
        return;
    }

    //Implementation of loop detecting in linkedlist
    //Floyd's cycle detection algorithm

    public void detectLoop(){
        Node slow=head,fast=head;
        int flag=0;
        
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Loop is detected");
        }
        else{
            System.out.println("Loop is not detected");
        }
    }

    //Implementation of reverse a linkedlist using recursion 
    public void reverseRec(Node curr,Node prev){
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }

        Node nextPtr=curr.next;
        curr.next=prev;
        reverseRec(nextPtr, curr);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);

        System.out.println("original linked list");
        ll.displayll();
        System.out.println();

        ll.insertAtEnd(10);
        ll.insertAtBeginning(1);
        ll.insertAtBeginning(9);
        System.out.println("After insertion of 10");
        ll.displayll();
        System.out.println();

        ll.insertAtAny(ll.head.next.next, 13);
        ll.insertAtAny(ll.head.next.next, 19);
        ll.insertAtAny(ll.head.next.next, 11);
        System.out.println("After insertion of 19");
        ll.displayll();
        System.out.println();

        // delete of node
        // ll.deleteNode(3);
        // ll.deleteNode(0);
        // System.out.println("After deletion at pos 3");
        // ll.displayll();
        // System.out.println();


        // ll.reversell();
        // System.out.println("Reverse implementation in a linked list");
        // ll.displayll();
        // System.out.println();
        
        // ll.reverseRec(ll.head, null);
        // System.out.println("Reverse implementation in a linked list using recursion");
        // ll.displayll();
        //ll.middleNode();

        Node temp= ll.head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=ll.head;

        ll.detectLoop();
        System.out.println();
    }

}