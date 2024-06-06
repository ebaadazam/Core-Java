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
    public Node intersectionPoint(Node head1, Node head2)  {
        if (head1 == null || head2 == null) {
            return null;
        }

        // Place temp1 at the head of the list1
        Node temp1 = head1;
        // Place temp2 at the head of the list2
        Node temp2 = head2;

        while (temp1 != temp2) {
            // Keep incrementing temp1 and temp2
            temp1=temp1.next;
            temp2=temp2.next;

            // When temp1 reaches null, move to head of list2 so as to make them align at the same step
            if (temp1 == null) {
                temp1 = head2;
            }
            // When temp2 reaches null, move to head of list1 so as to make them align at the same step
            if (temp2 == null) {
                temp2 = head1;
            }

            // If they become equal i.e if they intersect then return any one of them
            if (temp1 == temp2) {
                return temp1;
            }
        }
        return temp1;
    }
}

public class LinkedList_IntersectionPoint {
    public static void main(String[] args) {

        // Creating first linkedlist
        Node list1 = new Node(3);
        list1.next = new Node(1);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(6);
        list1.next.next.next.next = new Node(2);

        // Creating second linkedlist
        Node list2 = new Node(1);
        list2.next = new Node(2);
        list2.next.next = new Node(4);
        list2.next.next.next = list1.next.next; // intersection point
        list2.next.next.next.next = new Node(6);
        list2.next.next.next.next.next = new Node(2);

        LinkedList ll = new LinkedList();

        Node intersection = ll.intersectionPoint(list1, list2);

        if (intersection != null) {
            System.out.println("Intersection point is " + intersection.data);
        } 
        else {
            System.out.println("No intersection point");
        }
    }
}
