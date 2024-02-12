
// Import the ArrayList
import java.util.List;
import java.util.ArrayList;

public class ArrayListprogram {
    public static void main(String args[]) {

        // Creating an ArrayList
        List<Integer> mylist = new ArrayList<>(5);
        // Above is the Integer ArrayList but we could also have created String
        // ArrayList like List<String> mylist = new ArrayList<>(5);

        // Adding the elements to the ArrayList using add() method
        for (int i = 100; i < 800; i += 100) {
            mylist.add(i);
        }

        // Printing the elements in the ArrayList
        for (int i = 0; i < mylist.size(); i++) {
            System.out.print(mylist.get(i) + " ");
        }
        System.out.println();

        // Getting the size of the Array List using the size() method
        System.out.println("The current size of the ArrayList is: " + mylist.size());

        // To access a specific element from their index position, use get() method
        System.out.println("The Element at the 2th position is: " + mylist.get(2));

        // To remove a specific element from the ArrayList use remove() method
        System.out.println("The Element " + mylist.remove(3) + " is removed");

    }
}
