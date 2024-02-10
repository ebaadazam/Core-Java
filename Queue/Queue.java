import java.util.Scanner;

class QueueOperation {
    int len; // specify the length of the queue
    int nums[]; // queue
    int capacity; // for number of elements in the queue
    int front, rear; // front keep track of the elements popped and rear keep track of the elements
                     // inserted

    QueueOperation(int len) {
        this.len = len;
        nums = new int[len];
    }

    public void enqueue(int data) {
        if (!isFull()) {
            nums[rear] = data;
            rear++;
            capacity++;
        } else {
            System.out.println("Stack OverFlow!");
            System.exit(1);
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println(nums[front] + " removed");
            front++;
            capacity--;
        } else {
            System.out.println("Stack UnderFlow!");
            System.exit(1);
        }
    }

    public void peek() {
        System.out.println("The Peek of the Stack is: " + nums[front]);
    }

    public void size() {
        System.out.println("The Stack Size is: " + capacity);

    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public boolean isFull() {
        return len == capacity;
    }

    public void display() {
        System.out.println("Queue Elements are: ");
        for (int i = front; i < rear; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}

public class Queue {
    public static void main(String[] args) {

        // Taking input from the user
        System.out.print("Enter the length of the Queue: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();

        QueueOperation queue = new QueueOperation(len);

        queue.enqueue(12);
        queue.enqueue(10);
        queue.enqueue(18);
        queue.enqueue(15);
        queue.enqueue(14);

        queue.display();

        System.out.println("The Length of the Queue is: " + queue.len);
        System.out.println("The Capacity of the Queue is: " + queue.capacity);

        queue.dequeue();
        queue.dequeue();

        System.out.println("The Capacity of the Queue is: " + queue.capacity);

        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);

        queue.display();

        queue.peek();
    }
}
