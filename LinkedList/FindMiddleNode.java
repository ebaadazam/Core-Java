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

    public Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // By the time fast ptr reaches at the end, slow will surely be pointing to the
        // middle node
        return slow;
    }
}

class LinkedList_FindMiddleNode {
    public static void main(String[] args) {
        Node num1 = new Node(4);
        num1.next = new Node(2);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(12);
        // num1.next.next.next.next = new Node(8);

        LinkedList obj = new LinkedList();
        obj.head = num1;

        Node res = obj.findMiddle();
        System.out.println("The Middle Node of the given LinkedList is " + res.data);
    }

}

