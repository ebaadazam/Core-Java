// // Approach One
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}

class LinkedList {
    Node head;

    public void sort() {
        int zero = 0; // store the number of 0
        int one = 0; // store the number of 1
        int two = 0; // store the number of 2

        Node temp = head; // to traverse the list
        
        while (temp != null) {
            if (temp.data == 0)  {  zero += 1;  }
            else if (temp.data == 1)  {  one += 1;  }
            else  two += 1;
            temp=temp.next;
        }

        Node temp2=head;
        while (temp2 != null) {
            if (zero != 0) {
                temp2.data = 0;
                zero--;
            }
            else if (one != 0) {
                temp2.data = 1;
                one--;
            }
            else {
                temp2.data = 2; 
                two--;
            }
            temp2=temp2.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList_SortListOfZeroOneTwo {
    public static void main(String[] args) {

        Node n = new Node(0);
        n.next = new Node(2);
        n.next.next = new Node(1);
        n.next.next.next = new Node(0);
        n.next.next.next.next = new Node(1);
        n.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next = new Node(1);

        LinkedList obj = new LinkedList();
        obj.head = n;

        obj.display();
        obj.sort();
        obj.display();
    }
}



// Approach Two (Optimized)
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data=data;
        this.next=null;
    }
}

class LinkedList {
    Node head;

    public Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        Node temp=head;

        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero=temp;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one=temp;
            }
            else {
                two.next = temp;
                two=temp;
            }
            temp=temp.next;
        }
        zero.next = (oneDummy.next) != null ? (oneDummy.next) : (twoDummy.next);
        one.next = twoDummy.next;
        two.next = null;

        Node newHead = zeroDummy.next;
        return newHead;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList_SortListOfZeroOneTwo {
    public static void main(String[] args) {

        Node n = new Node(2);
        n.next = new Node(1);
        n.next.next = new Node(1);
        n.next.next.next = new Node(2);
        n.next.next.next.next = new Node(0);
        n.next.next.next.next.next = new Node(0);
        n.next.next.next.next.next.next = new Node(1);

        LinkedList obj = new LinkedList();
        obj.head = n;

        obj.display();

        obj.head = obj.sort(obj.head);
        obj.display();

    }
}

