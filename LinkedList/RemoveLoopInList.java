class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;

    // function to find the starting point
    public Node findStartingPoint(Node head) {
        if (head == null) { return null; }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast)  {
                    slow = slow.next;
                    fast = fast.next; }
                return slow;
            }
        }
        return null; }


    public Node removeLoop(Node head){
        // In order to remove the loop from the list, first we need to find the starting point.
        // Store your starting point in a variable. Traverse through the list and when the Node is
        // pointing to the starting point node then we remove the link from there and point to null
        Node startingNode = findStartingPoint(head);

        if (startingNode == null) {
            return head; // No loop found
        }

        Node temp = startingNode;
        while(temp.next != startingNode){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}

public class LinkedList_RemoveLoopInList {
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
        Node res = obj.removeLoop(obj.head);

        while (res != null) {
            System.out.print(res.data + " -> ");
            res = res.next;
        }
        System.out.println("null");
    }
}

