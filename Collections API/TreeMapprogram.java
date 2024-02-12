import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapprogram {
    public static void main(String args[]) {

        // Declaration of the HashSet object
        TreeMap<String, Integer> map = new TreeMap<>();

        // Adding elements to the TreeMap
        map.put("E", 68);
        map.put("B", 69);
        map.put("A", 70);
        map.put("A", 71);
        map.put("D", 72);
        map.put("A", 73);
        map.put("Z", 74);
        map.put("A", 75);
        map.put("M", 76);
        System.out.println(map);

        // Removing the specific key from the TreeMap
        map.remove("B");
        System.out.println(map);

        // Checking if a Key is present in TreeMap and if present it returns true else
        // false
        boolean var = map.containsKey("E");
        if (var) {
            System.out.println("Yes It contains the key and Its value is " + map.get("E"));
        } else {
            System.out.println("Key not present");
        }

        // keySet() is used to iterate over the TreeMap
        System.out.println(map.keySet());

        // prinitng the keys and values using keySet() method
        for (String k : map.keySet()) {
            System.out.println("Key is: " + k + " " + "Value is: " + map.get(k));
        }

        // Using the Entry i.e, the utility method of TreeMap that we imported
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key is: " + entry.getKey() + " " + "Value is: " + entry.getValue());
        }

    }
}
