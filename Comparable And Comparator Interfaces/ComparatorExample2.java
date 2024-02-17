// Sorting the list on the basis of the last digit of a number

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorExample2 {

    public static void main(String args[]) {

        // Comparator is an interface used to control the order of a collection of
        // objects (such as sorting them)
        Comparator<Integer> obj = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1; // 1 means swap
                } else {
                    return -1; // -1 means dont swap
                }
            }
        };

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(40);
        list.add(23);
        list.add(32);
        list.add(11);

        System.out.println(list);

        list.sort(obj); // applying sorting with the object of Comparator

        // Iterator is an interface which provides a way to traverse the collections of
        // objects
        Iterator<Integer> val = list.iterator();
        while (val.hasNext()) {
            System.out.println(val.next());
        }
    }

}
