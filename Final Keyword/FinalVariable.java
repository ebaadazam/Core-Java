public class FinalVariable {

    // Declaring a final variable
    final int value = 100;

    public static void main(String[] args) {

        FinalVariable obj = new FinalVariable();

        // Trying to change the value of MAX_VALUE will result in a compilation error
        // example.MAX_VALUE = 200; // This line will cause a compilation error

        System.out.println("The maximum value is: " + obj.value);
    }
}
