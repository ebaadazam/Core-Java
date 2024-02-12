import java.util.*;

public class HashSetprogram {
    public static void main(String args[]) {

        // Declaration of the HashSet object
        HashSet<Integer> hashset = new HashSet<>();

        // Adding elements to the List
        hashset.add(10);
        hashset.add(100);
        hashset.add(1000);
        hashset.add(10000);
        hashset.add(10001);
        hashset.add(100001);
        System.out.println(hashset);

        // Removing the specific elements from the list
        hashset.remove(10);
        System.out.println(hashset);

        // Checking if the element is present in set and if present it returns true else
        // false
        boolean var = hashset.contains(100);
        if (var) {
            System.out.println("It contains 100");
        }

    }
}
