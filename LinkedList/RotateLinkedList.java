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

    // Method to find the new tail of the list after rotation
    private Node findNewTail(Node temp, int k) {
        int count = 1;
        while (temp != null) {
            if (count == k) {
                return temp;
            }
            temp = temp.next;
            count++;
        }
        return temp;
    }

    // Method to rotate the list
    public void rotateList(int k) {
        if (head == null || k == 0) {
            return;
        }

        Node tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return;
        }

        tail.next = head; // Connect tail to head to make it circular
        Node newLastNode = findNewTail(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;
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

class LinkedLIst_Rotate {
    public static void main(String[] args) {
        Node num1 = new Node(2);
        num1.next = new Node(4);
        num1.next.next = new Node(3);
        num1.next.next.next = new Node(12);
        num1.next.next.next.next = new Node(5);

        LinkedList obj = new LinkedList();
        obj.head = num1;
        System.out.println("Original list:");
        obj.printList();

        obj.rotateList(2);
        System.out.println("Rotated list:");
        obj.printList();
    }
}

