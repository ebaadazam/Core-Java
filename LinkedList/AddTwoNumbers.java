class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
    }

}

class LinkedList {
    Node head;

    public Node addTwoNumbers(Node num1, Node num2) {

        Node dummyHead = new Node(-1); // create a dummyNode with any value
        Node current = dummyHead; // current points to the dummyHead
        Node temp1 = num1; // take temp1 at the head of the num1 list
        Node temp2 = num2; // take temp2 at the head of the num2 list
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
            }
            if (temp2 != null) {
                sum += temp2.data;
            }
            Node newNode = new Node(sum % 10); // create a new node by storing only the last digit if the no is of two digit
            carry = sum / 10; // and the other number will go to carry

            current.next = newNode; // place the new node after the dummyhead as the current was pointing to the dummyHead
            current = current.next; // move the current pointer

            // Move the temp1 until the list is not null
            if (temp1 != null) {
                temp1 = temp1.next;
            }

           // Move the temp2 until the list is not null
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        if (carry != 0) {
            Node newNode = new Node(carry);
            current.next = newNode;
        }
        return dummyHead.next;
    }
}

class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        // Example for number 342 (2 -> 4 -> 3)
        Node num1 = new Node(2);
        num1.next = new Node(4);
        num1.next.next = new Node(3);

        // Example for number 465 (5 -> 6 -> 4)
        Node num2 = new Node(5);
        num2.next = new Node(6);
        num2.next.next = new Node(4);

        Node result = obj.addTwoNumbers(num1, num2);

        // Print the resulting linked list
        Node current = result;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }
}
