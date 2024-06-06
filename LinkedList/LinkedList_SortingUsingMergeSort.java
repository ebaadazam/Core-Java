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

    // Method to find the middle of the linked list
    private Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head.next; // Start fast one step ahead

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to merge the two sorted lists
    private Node mergeTwoSortedLists(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return dummy.next;
    }

    // Method to perform the merge sort
    public Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = findMiddle(head); // Getting the middle of the list by calling the findMiddle() method
        Node right = middle.next; // Getting the right portion of the list starting after the middle node
        middle.next = null; // Mark middle.next as null to split the list

        Node left = head; // Getting the left portion of the list

        // Recursively sorting both halves of the list
        left = sort(left);
        right = sort(right);

        return mergeTwoSortedLists(left, right);
    }

    // Method to print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList_Sorting {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(3);
        n.next.next = new Node(5);
        n.next.next.next = new Node(4);
        n.next.next.next.next = new Node(2);

        LinkedList obj = new LinkedList();
        obj.head = n;

        // Printing the list before sorting
        obj.printList();
        
        // Sorting the list
        obj.head = obj.sort(obj.head);

        // Printing the list after sorting
        obj.printList();
    }
}

