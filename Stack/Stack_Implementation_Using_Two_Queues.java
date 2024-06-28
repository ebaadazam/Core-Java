// Implementing Stack Using Two Queues
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
import java.util.Iterator;

class Stack_StackImplementationUsingTwoQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public Stack_StackImplementationUsingTwoQueues() {
        /*
         * Using Comparator.reverseOrder() in the PriorityQueue is necessary because by
         * default,
         * PriorityQueue in Java is a min-heap where the smallest element is always at
         * the front. To use it as a stack where the last added element should
         * come out first (LIFO), we need it to behave like a max-heap.
         * Comparator.reverseOrder() provides a comparator that imposes the reverse of
         * the natural ordering. When used with PriorityQueue, it effectively turns it
         * into a max-heap.
         */
        queue1 = new PriorityQueue<>(Comparator.reverseOrder());
        queue2 = new PriorityQueue<>(Comparator.reverseOrder());
    }

    // Push operation
    public void push(int data) {
        // Add new element to queue2
        queue2.add(data);

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // Swap the names of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop operation
    public void pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        queue1.poll();
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue1.peek();
    }

    // Is empty operation
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // Display operation
    public void display() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: [ ");
        Iterator<Integer> iterator = queue1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Stack_StackImplementationUsingTwoQueues stack = new Stack_StackImplementationUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();
        System.out.println("Top element: " + stack.top());

        stack.pop();
        stack.display(); 
        System.out.println("Top element after pop: " + stack.top()); 
        System.out.println("Stack is empty: " + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
        System.out.println("Stack is empty after multiple pops: " + stack.isEmpty());
    }
}

