import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReaderClass {
    public static void main(String[] args) throws NumberFormatException, IOException {

        InputStreamReader isp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isp);

        // Input value as String
        System.out.println("Enter your name:");
        String name = br.readLine();

        // Input value as Integer
        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine()); // Integer.parseInt() is used to convert a string to integer value

        // Input value as Floating Value
        System.out.println("Enter your height (in meters):");
        double height = Double.parseDouble(br.readLine());

        // Input value as Boolean
        System.out.println("Enter whether you are married (true/false):");
        boolean married = Boolean.parseBoolean(br.readLine());

        // Display the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Married: " + married);

        // Close the BufferedReader
        br.close();
    }
}
