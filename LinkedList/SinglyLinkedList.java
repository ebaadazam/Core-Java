// Node Class
class Node {
    int data; // data of the node
    Node next; // reference to the next node
}

// LinkedList Class
class Linked {

    Node head;

    public void insertAtBegin(int data) {

        // Creating a new node with node data and address as null
        Node node = new Node();
        node.data = data;
        node.next = null;

        // Inserting the new node at the beginning
        node.next = head;
        head = node;
    }

    public void insertAtPos(int index, int data) {

        // Creating a new node with node data and address as null
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtBegin(data);
        }

        else {
            Node n = head;
            int count = 0;
            while (count != index - 1) {
                n = n.next;
                count++;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void insertAtEnd(int data) {

        // Creating a new node with node data and address as null
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }

        else {
            // Take a temporary variable n of type Node to iterate through the list
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void deleteAtBegin() {
        Node n = head;
        head = n.next;
        n.next = null;
    }

    public void deleteAtPos(int index) {
        if (index == 0) {
            deleteAtBegin();
        }

        else {
            Node n = head;
            int count = 0;
            Node n1;
            while (count != index - 1) {
                n = n.next;
                count++;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }

    public void deleteAtEnd() {
        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;
    }

    public void display() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data);
        System.out.println();
    }
}

// Main Class
public class SinglyLinkedList {
    public static void main(String[] args) {
        Linked list = new Linked(); // creating an instance of the Linked class
        list.insertAtEnd(15);
        list.insertAtEnd(25);
        list.insertAtEnd(35);
        list.insertAtEnd(45);
        list.insertAtEnd(55);

        list.insertAtBegin(100);

        list.insertAtPos(2, 20);

        list.insertAtPos(4, 30);

        list.deleteAtBegin();
        list.deleteAtBegin();

        list.deleteAtPos(1);

        list.deleteAtEnd();
        list.deleteAtEnd();

        list.display();
    }

}

