public class FinalVariable {
    public static void main(String[] args) {
        final int num = 10; // we have declared a variable as final
        // num = 99; // now this line will produce an error
        System.out.println("The value of num is " + num);
    }
}
