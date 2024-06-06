// // Approach One
// /* Take 1st node and compare it with the rest of the list and after reaching at null again take 2nd node and compare
//  * it with the rest of the list and so on but it will take O(n2) as we will be using two loops
//  */
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
        
        while (current != null) {
            Node afterCurrent = current.next;
            Node temp = afterCurrent;
            Node prev = null;

            while (temp != null) {
                if (current.data == temp.data) {
                    Node delete = temp;
                    prev.next = temp.next;
                    delete.next = null;
                }
                prev = temp;
                temp = temp.next;
            }
            current=current.next;
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

public class LinkedList_RemoveDuplFromUnsortedList {
    public static void main(String[] args) {
        Node n = new Node(4);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(1);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next = new Node(1);
        n.next.next.next.next.next.next.next = new Node(5);

        LinkedList obj = new LinkedList();
        obj.head = n;
        
        // printing the list before removing duplicates
        obj.print();

        // removing the duplicates and printing the list
        Node res = obj.removeDuplicates(obj.head);
        while(res!=null){
            System.out.print(res.data+" -> ");
            res=res.next;
        }
        System.out.println("null");
    }  
}




// // Approach Two
// // First we will sort the list and then remove duplicates just like we did in Remove Duplicates in Sorted List
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

    // Method to find the middle of the linked list
    private Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head.next; // Start fast one step ahead

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to merge the two sorted lists
    private Node mergeTwoSortedLists(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }
        return dummy.next;
    }

    // Method to perform the merge sort
    public Node sort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = findMiddle(head); // Getting the middle of the list by calling the findMiddle() method
        Node right = middle.next; // Getting the right portion of the list starting after the middle node
        middle.next = null; // Mark middle.next as null to split the list
        Node left = head; // Getting the left portion of the list
        // Recursively sorting both halves of the list
        left = sort(left);
        right = sort(right);
        return mergeTwoSortedLists(left, right);
    }

    // Method to remove the duplicates from sorted list
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

public class LinkedList_RemoveDuplFromUnsortedList {
    public static void main(String[] args) {
        Node n = new Node(4);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(1);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next = new Node(1);
        n.next.next.next.next.next.next.next = new Node(5);

        LinkedList obj = new LinkedList();
        obj.head = n;

        // Printing the list before removing duplicates
        System.out.println("Original List:");
        obj.printList();

        // Sorting the list
        obj.head = obj.sort(obj.head);

        // Removing duplicates
        obj.head = obj.removeDuplicates(obj.head);

        // Printing the list after removing duplicates
        System.out.println("List after removing duplicates:");
        obj.printList();        
    }
}




// Approach Three
// Using a Hashmap where we will keep track of the visited element in the list

import java.util.HashMap;

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
        if (head == null) 
            return null;
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        Node current = head; // mark current at the head of the list
        Node prev = null; // prev will always point to one less than current node
        
        while (current != null) {
            if (map.containsKey(current.data)) {
                prev.next = current.next; //skip the duplicate node in the list
            }
            else {
                map.put(current.data, true);
                prev=current;
            }
            current = current.next;
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

public class LinkedList_RemoveDuplFromUnsortedList {
    public static void main(String[] args) {
        Node n = new Node(4);
        n.next = new Node(2);
        n.next.next = new Node(4);
        n.next.next.next = new Node(1);
        n.next.next.next.next = new Node(3);
        n.next.next.next.next.next = new Node(2);
        n.next.next.next.next.next.next = new Node(1);
        n.next.next.next.next.next.next.next = new Node(5);

        LinkedList obj = new LinkedList();
        obj.head = n;
        
        // printing the list before removing duplicates
        obj.print();

        obj.removeDuplicates(obj.head);

        // removing the duplicates and printing the list
        obj.print();
    }
}

