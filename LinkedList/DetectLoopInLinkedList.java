class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to detect the loop in a LinkedList
    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }
}

class LinkedList_DetectLoop {
    public static void main(String[] args) {

        Node num1 = new Node(4);
        num1.next = new Node(2);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(12);
        num1.next.next.next.next = new Node(8);

        // Creating a loop for testing: Point next of the last node to the second node
        num1.next.next.next.next.next = num1.next;

        LinkedList obj = new LinkedList();
        obj.head = num1;

        boolean result = obj.detectLoop();
        System.out.println("Is there a loop in the given LinkedList?(True/False): " + result);
    }
}

