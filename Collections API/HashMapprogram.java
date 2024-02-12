import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapprogram {
    public static void main(String args[]) {

        // Declaration of the HashSet object
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("E", 68);
        map.put("B", 69);
        map.put("A", 70);
        map.put("A", 71);
        map.put("D", 72);
        System.out.println(map);

        // Removing the specific key from the Hashmap
        map.remove("B");
        System.out.println(map);

        // Checking if a Key is present in HashMap and if present it returns true else
        // false
        boolean var = map.containsKey("E");
        if (var) {
            System.out.println("Yes It contains the key and Its value is " + map.get("E"));
        } else {
            System.out.println("Key not present");
        }

        // keySet() is used to iterate over the hashmap
        System.out.println(map.keySet());

        // prinitng the keys and values using keySet() method
        for (String k : map.keySet()) {
            System.out.println("Key is: " + k + " " + "Value is: " + map.get(k));
        }

        // Using the Entry i.e, the utility method of HashMap that we imported
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key is: " + entry.getKey() + " " + "Value is: " + entry.getValue());
        }

    }
}
