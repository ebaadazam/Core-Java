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
    public Node removeDuplicates(Node head) {
        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList_RemoveDuplFromSortedList {
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(2);
        n.next.next.next = new Node(3);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = new Node(4);
        n.next.next.next.next.next.next = new Node(4);
        n.next.next.next.next.next.next.next = new Node(5);

        LinkedList obj = new LinkedList();
        obj.head = n;

        // printing the list before removing duplicates
        obj.print();
      
        Node res = obj.removeDuplicates(obj.head);

        // printing the list after removing duplicates
        while(res!=null){
            System.out.print(res.data+" -> ");
            res=res.next;
        }
        System.out.println("null");
    }
}
