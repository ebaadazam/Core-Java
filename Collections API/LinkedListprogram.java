import java.util.LinkedList;

public class LinkedListprogram {
    public static void main(String args[]) {

        // Declaration of the Linkedlist object
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the List
        list.add(10);
        list.add(11);
        list.add(17);
        list.add(13);
        list.add(15);
        System.out.println(list);

        list.add(1, 1000);
        list.addFirst(100);
        list.addLast(200);
        System.out.println(list);

        // Removing the elements from the list
        list.remove(1);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // Accessing the element
        int a = list.get(2);
        int b = list.getFirst();
        int c = list.getLast();
        System.out.println("The Element at Index 2 is: " + a);
        System.out.println("The First Element is: " + b);
        System.out.println("The Last Element is: " + c);

        // Updating the elements
        list.set(0, 1200);
        System.out.println(list);

        // Finding the size of the list
        System.out.println("The Size of the list is: " + list.size());

        // Checking if the list is empty
        System.out.println("The List is Empty? (T means Empty, F means Not Empty): " + list.isEmpty());

        // indexOf(element): Returns the index of the first occurrence of the specified
        // element.
        // lastIndexOf(element): Returns the index of the last occurrence of the
        // specified element
        // iterator(): Returns an iterator over the elements in the list.
        // forEach(consumer): Performs the given action for each element of the list.

    }
}
