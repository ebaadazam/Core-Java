// // Approach One with Stack Data Structure
import java.util.Stack;
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
    public boolean ispalindrome() {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp=temp.next;
        }
        Node temp2 = head;
        while (temp2 != null) {
            if (temp2.data != stack.pop()) {
                return false;
            }
            temp2=temp2.next;
        }
        return true;
    }

    public void printthelist() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println(" null ");
    }
}
    

class Main {
    public static void main(String[] args) {
        Node num1 = new Node(2);
        num1.next = new Node(4);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(4);
        num1.next.next.next.next = new Node(2);

        LinkedList obj = new LinkedList();
        obj.head = num1;
        boolean res = obj.ispalindrome();
        System.out.println(res);
        obj.printthelist();
    }
}


// Approach Second (Optimized one)
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

    // Function to reverse the list
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome() {

        // find the middle node of the list using slow and fast ptrs
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast=fast.next.next;
            slow=slow.next;
        }

        // after the slow ptr there will be the second half and we are going to reverse the second half
        Node newHead = reverse(slow.next);

        // assign the first ptr at the first node of first half and second ptr at the first node of second half
        Node first = head;
        Node second = newHead;

        // comparing the first and second ptr
        while (second != null) {
            if (first.data != second.data) {
                reverse(newHead); //make it back to its original position if not equal, its a good practice
                return false;
            }
     
            // increment both ptr
            first = first.next;
            second = second.next;
        }
            reverse(newHead); //make it back to its original position if equal, its a good practice
            return true;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null ");
}
}

class Main {
    public static void main(String[] args) {
        Node num1 = new Node(12);
        num1.next = new Node(4);
        num1.next.next = new Node(6);
        num1.next.next.next = new Node(4);
        num1.next.next.next.next = new Node(12);

        LinkedList obj = new LinkedList();
        obj.head = num1;
        
        boolean res = obj.isPalindrome();
        System.out.println(res);
    }
}

