import java.util.List;
import java.util.PriorityQueue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // This Method will accept the list of type Node and merges multiple sorted
    // linked lists into one sorted linked list using a priority queue (min-heap).
    public Node mergeKLists(List<Node> lists) {

        // A priority queue is initialized with a comparator that sorts nodes based on
        // their data value in ascending order.
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Adding the head node of all LinkedLists in the priority queue
        for (Node node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        Node dummy = new Node(0); // a dummy node is created to help build the new merged linked list
        Node temp = dummy; // mark temp on the dummy node

        // Now we are taking out nodes from the queue and adding ir

        while (!pq.isEmpty()) {

            // The smallest node is extracted from the priority queue using pq.poll() and it is added to the merged list.
            Node node = pq.poll();
            temp.next = node; // adding it to the next of dummy node
            temp = temp.next; // increment the temp

            // If the extracted node has further list i.e, next node, that next node is added to the priority queue.
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return dummy.next; // returning the head
    }
}

public class LinkedList_MergeKSortedLists {
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(4);
        list1.next.next = new Node(5);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);
        list2.next.next.next = new Node(10);

        Node list3 = new Node(2);
        list3.next = new Node(6);
        list3.next.next = new Node(8);

        LinkedList obj = new LinkedList();

        // All three lists are combined into the variable 'lists'
        List<Node> lists = List.of(list1, list2, list3);

        Node mergedHead = obj.mergeKLists(lists);
        printList(mergedHead);
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


