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
