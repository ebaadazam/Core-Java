import java.util.TreeSet;

public class TreeSetprogram {
    public static void main(String args[]) {

        // Declaration of the HashSet object
        TreeSet<Integer> treeset = new TreeSet<>();

        // Adding elements to the TreeSet
        treeset.add(102);
        treeset.add(99);
        treeset.add(100);
        treeset.add(90);
        treeset.add(100);
        treeset.add(10);
        System.out.println(treeset);

        // Removing the specific elements from the TreeSet
        treeset.remove(90);
        System.out.println(treeset);

        // Checking if the element is present in TreeSet and if present it returns true
        // else
        // false
        boolean var = treeset.contains(100);
        if (var) {
            System.out.println("It contains 100");
        }

        System.out.println("The size of the TreeSet is: " + treeset.size());
        System.out.println("Empty or Not?: " + treeset.isEmpty());
        System.out.println("The first element of the TreeSet is: " + treeset.first());
        System.out.println("The last element of the TreeSet is: " + treeset.last());

    }
}
