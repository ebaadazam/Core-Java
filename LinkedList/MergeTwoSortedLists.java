// Approaach One using the dummy node
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

    public Node mergeLists(Node head1, Node head2) {

        // Mark temp1 at the head of first list 
        Node temp1 = head1;
        // Mark temp2 at the head of second list
        Node temp2 = head2;

        // Create a dummy node for linking the list in sorted order starting from the dummy node
        Node dummyNode = new Node(-1);
        // Place temp at the dummyNode
        Node temp = dummyNode;

        while (temp1 != null && temp2 != null) {

            // Move temp1 and temp2 simultaneously and link with the dummy node whichever is smaller
            if (temp1.data <= temp2.data) {
                temp.next = temp1;
                temp = temp1; //points temp at the current node
                temp1 = temp1.next;
            }
            else {
                temp.next = temp2;
                temp = temp2; //points temp at the current node
                temp2 = temp2.next;
            }
        }

        // Adding the leftover elements to the list
        if (temp1 != null) 
            temp.next=temp1;
        else 
            temp.next=temp2;

        return dummyNode.next; // dummyNode.next will be the head
    }
}

class LinkedList_MergeTwoSortedLists {
    public static void main(String[] args) {
    
    // Creating first sorted linkedlist
    Node list1 = new Node(2);
    list1.next = new Node(4);
    list1.next.next = new Node(8);
    list1.next.next.next = new Node(10);

    // Creating second sorted linkedlist
    Node list2 = new Node(1);
    list2.next = new Node(3);
    list2.next.next = new Node(3);
    list2.next.next.next = new Node(6);
    list2.next.next.next.next = new Node(11);
    list2.next.next.next.next.next = new Node(14);

    LinkedList obj = new LinkedList();

    Node res = obj.mergeLists(list1, list2);
    Node result = res;
    while(result != null){
        System.out.print(result.data + " -> ");
        result = result.next;
        }
        System.out.println("null");
    }
}



// Approach Two  (Most Probably optimal)
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public Node mergeTwoSortedLists(Node head1, Node head2){
        if (head1 == null){
            return head2;
        }
        else if (head2 == null) {
            return head1;
        }
        
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = null;
        
        if (temp2.data <= temp1.data){
            head = temp2;
            temp2=temp2.next;
        }
        else{
            head = temp1;
            temp1=temp1.next;
        }

        Node current = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data){
                current.next = temp1;
                temp1 = temp1.next;
            }
            else{
                current.next = temp2;
                temp2 = temp2.next;
            }
            current=current.next;
        }
        if (temp1 != null) {
            current.next=temp1;
        }
        else{
            current.next=temp2;
        }
        return head;
    }
}

class PracticeLinkedList{
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next.next = new Node(6);

        Node list2 = new Node(7);
        list2.next = new Node(8);
        list2.next.next = new Node(9);

        LinkedList obj = new LinkedList();
        Node result = obj.mergeTwoSortedLists(list1, list2);

        Node res = result;
        while(res != null){
            System.out.print(res.data + " -> ");
            res = res.next;
        }
        System.out.println("null");
    }
}
