import java.util.Scanner;

public class UsingScannerClass {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter comma-separated values
        System.out.println("Enter the following values (Name, Age, Height, Married):");

        // Input value as String
        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        // Input value as Integer
        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        // Input value as Floating Value
        System.out.println("Enter your height (in meters):");
        double height = sc.nextDouble();

        // Input value as Boolean
        System.out.println("Enter whether you are married (true/false):");
        boolean married = sc.nextBoolean();

        // Display the Inputed Values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Married: " + married);

        // Close the scanner to release system resources
        sc.close();
    }
}
