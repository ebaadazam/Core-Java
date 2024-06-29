// Builtin Implementation of the Doubly Ended Queue
//  Deque interface is a part of the Java Collections Framework. The Deque interface extends the Queue interface and allows for element insertion and removal at both ends (the head and the tail).
// Doubly Ended Queue

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice2 {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addFirst(7);
        System.out.println(deque); // [7 5 3 1]

        deque.addLast(2);
        deque.addLast(4);
        deque.addLast(6);
        System.out.println(deque); // [7 5 3 1 2 4 6]

        deque.removeFirst();
        deque.removeFirst();
        System.out.println(deque); // [3, 1, 2, 4, 6]
        
        deque.removeLast();
        deque.removeLast();
        System.out.println(deque); // [3 1 2]
    }
}
