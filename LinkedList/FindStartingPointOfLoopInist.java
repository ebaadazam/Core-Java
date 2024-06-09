class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    
    // First we need to make sure that there is a loop in linkedlist, and then we will find the starting
    // point
    public Node findStartingPoint(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}


public class LinkedlIst_FindStartingPointOfLoop {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(5);
        n.next.next.next.next.next = new Node(6);
        n.next.next.next.next.next.next = new Node(7);
        n.next.next.next.next.next.next.next = new Node(8);
        n.next.next.next.next.next.next.next.next = n.next.next.next; // creating a loop at node 4

        LinkedList obj = new LinkedList();
        obj.head = n;
        Node res = obj.findStartingPoint(obj.head);
        System.out.println(res.data);

      
    }
}

