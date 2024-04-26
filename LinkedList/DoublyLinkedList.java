// Doubly LinkedList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LinkedList {
    Node head; // points to the first element
    Node tail; // points to the last element
    int size = 1;

    public void insertionAtBegin(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }

    public void insertionAtPos(int pos, int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            size++;
        } else if (pos == 0) {
            insertionAtBegin(data);
            size++;
        } else if (pos > size) {
            System.out.println("The Position at which you are trying to insert your node is not available!");
        } else {
            int count = 0;
            Node temp = head;
            while (count != pos - 1) {
                temp = temp.next;
                count++;
            }
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
            size++;
        }
    }

    public void insertionAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            size++;
        }
    }

    public void deletionAtBegin() {
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deletionAtPos(int pos) {
        if (pos == 0) {
            deletionAtBegin();
        } else {
            Node temp = head;
            int count = 0;
            while (count != pos - 1) {
                temp = temp.next;
                count++;
            }
            Node temp2 = temp.next;
            temp.next = temp2.next;
            temp2.next.prev = temp.next;
            temp2 = null;
        }
    }

    public void deletionAtLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void displayList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> " + "null");
    }

    public void searchNode(int toBeSearched) {
        Node temp = head;
        boolean isPresent = false;
        while (temp != null) {
            if (temp.data == toBeSearched) {
                isPresent = true;
            }
            temp = temp.next;
        }
        if (isPresent) {
            System.out.println(toBeSearched + " is present in the list!");
        } else {
            System.out.println(toBeSearched + " is not present in the list!");
        }
    }
}

class PracticeLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertionAtLast(2);
        list.insertionAtLast(8);
        list.insertionAtLast(4);
        list.insertionAtLast(12);
        list.insertionAtLast(10);

        list.displayList();

        list.insertionAtBegin(100);
        list.displayList();

        list.insertionAtPos(4, 200);
        list.displayList();

        list.insertionAtPos(6, 400);
        list.displayList();

        System.out.println("The Current Size of the LinkedList is " + list.size);

        list.deletionAtBegin();

        list.deletionAtLast();
        list.displayList();

        list.deletionAtPos(3);
        list.displayList();

        list.searchNode(400);

    }
}
