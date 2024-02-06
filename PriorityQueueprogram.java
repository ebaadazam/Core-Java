import java.util.PriorityQueue;

public class PriorityQueueprogram {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(999);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(80);

        System.out.println(queue);

        // Pops the first element as it is based on FIFO
        queue.remove();
        queue.remove();

        System.out.println(queue);

        System.out.println("The top element of the Queue is: " + queue.peek());

        // poll() is used to remove the first element and also return the element that
        // is removed
        queue.poll();
        System.out.println(queue);

    }
}
