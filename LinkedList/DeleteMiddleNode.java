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

    public void DeleteMiddleNode() {
        Node slow = head;
        Node fast = head;
        Node prev = null; 
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // We maintain a reference to the node just before the slow pointer to delete the middle node
        // by the time fast ptr reaches at the end, slow will surely be pointing to the middle node

      
        // Delete the middle node by skipping it
        if (prev != null) {
            prev.next = slow.next;
        }   
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

class LinkedList_DeleteMiddleNode {
    public static void main(String[] args) {
        Node num1 = new Node(4);
        num1.next = new Node(2);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(12);
        num1.next.next.next.next = new Node(8);

        LinkedList obj = new LinkedList();
        obj.head = num1;

        System.out.println("LinkedList before removing the middle node:");
        obj.printList();

        obj.DeleteMiddleNode();
        System.out.println("LinkedList after removing the middle node:");
        obj.printList();
    }
}
