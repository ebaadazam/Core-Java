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

    // Method to reverse the List
    public void ReverseList() {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        head = prev;
    }

    // Method to print the List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); // To end the line after printing the list
    }
}

public class ReverseLinkedListDSA {
    public static void main(String[] args) {

        Node num1 = new Node(2);
        num1.next = new Node(4);
        num1.next.next = new Node(3);
        num1.next.next.next = new Node(12);
        num1.next.next.next.next = new Node(5);

        LinkedList obj = new LinkedList();
        obj.head = num1;
        obj.printList();

        // reversing the list
        obj.ReverseList();
        obj.printList();
    }
}
