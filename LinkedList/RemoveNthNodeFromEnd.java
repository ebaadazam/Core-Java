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

    public Node removeNthNodeFromEnd(int n) {
        Node fast = head;
        Node slow = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // If fast reached the end, remove the head
        if (fast == null)
            return head.next;

        // Move fast to the end to find the nth node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // As our slow is now one element before the element to be removed so we link slow to the Node after the node to be deleted
        slow.next = slow.next.next;
        return head;
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

class LinkedList_RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        Node num1 = new Node(4);
        num1.next = new Node(2);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(12);
        num1.next.next.next.next = new Node(8);

        LinkedList obj = new LinkedList();
        obj.head = num1;

        System.out.println("Original list:");
        obj.printList();

        // Remove the 2nd node from the end
        obj.removeNthNodeFromEnd(2);

        System.out.println("List after removing 2nd node from the end:");
        obj.printList();
    }
}

