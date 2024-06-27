// Queue Implementation Using LinkedList
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue_QueueImplementationUsingLinkedLIst {

    // Head and tail of the linked list
    private Node front, rear;
    private int size;

    // Constructor to initialize an empty queue
    public Queue_QueueImplementationUsingLinkedLIst() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = this.rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Method to remove an element from the queue
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        front = front.next;
        temp.next=null;
        size--;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to display the elements of the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: [ ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Queue_QueueImplementationUsingLinkedLIst queue = new Queue_QueueImplementationUsingLinkedLIst();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();

        System.out.println("Peek element: " + queue.peek());
        System.out.println("Size of the queue: " + queue.size());

        queue.dequeue();
        queue.display();
        System.out.println("Peek element: " + queue.peek());
        System.out.println("Size of the queue: " + queue.size());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("Empty? " + queue.isEmpty());
    }
}

