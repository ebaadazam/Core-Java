import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeListAsInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("Enter strings (space-separated):");
        String line = sc.nextLine(); // Read the whole line of input
        String[] items = line.split(" "); // Split the line into items, assuming space-separated

        for (String item : items) {
            list.add(item);
        }

        System.out.println("List: " + list);

        sc.close();
    }
}
