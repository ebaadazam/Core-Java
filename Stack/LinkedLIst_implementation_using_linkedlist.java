class Node{
    int data;
    Node next;
    public Node (int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListImplementation {
    Node head; // we will make head point to the latest node inserted

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        // Whenever any new elements are added to the list, update the head pointer.
        head = newNode; 
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        } else {
        head = head.next;
        }
    }

    public void peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        } else{
            System.out.println("Top element is: " + head.data);
        }
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void isFull() {
        // Since a linked list-based stack is dynamically allocated and can grow as needed (until the 
        // memory limit is reached), it typically doesn't have a isFull() method.
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Stack_LinkedListImplementationUsingStack {
    public static void main(String[] args) {
        LinkedListImplementation stack = new LinkedListImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();

        stack.pop();
        stack.display();
    }
}
