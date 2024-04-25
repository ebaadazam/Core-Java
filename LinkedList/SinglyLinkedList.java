class Node {
    int data; // data of the node
    Node next; // reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int size = 1;

    public void insertionAtBegin(int data) {
        // Creating a new node with node data and address as null
        Node node = new Node(data);
        
        node.next = head;
        head = node;
        size++;
    }

    public void insertionAtPos(int pos, int data) {
        // Creating a new node with node data and address as null
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

            // Take a temporary variable 'temp' of type Node to iterate through the list
            Node temp = head;
            while (count != pos - 1) {
                temp = temp.next;
                count++;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void insertionAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
             // Take a temporary variable 'temp' of type Node to iterate through the list
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }

    public void deletionAtBegin() {
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deletionAtPos(int pos) {
        Node temp = head;
        int count = 0;
        while (count != pos - 1) {
            temp = temp.next;
            count++;
        }
        Node temp2 = temp.next;
        temp.next = temp2.next;
        temp2.next = temp;
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
        System.out.println();

        list.insertionAtPos(3, 18);
        list.displayList();
        System.out.println();

        list.insertionAtPos(5, 16);
        list.displayList();
        System.out.println();

        System.out.println("The Current Size of the LinkedList is " + list.size);

        list.deletionAtBegin();
        list.displayList();

        list.deletionAtPos(4);
        list.displayList();

        list.searchNode(18);

    }
}

