class Calculator {
    // When we make this add method as final then we cant override it using a sub
    // class
    // If you remove final keyword then you can override
    final public int add(int a, int b) {
        return a + b;
    }
}

class AdvanceCalculator extends Calculator {

    // Trying to override the final method will result in a compilation error
    // @Override
    // public int add(int a, int b) {
    // return a + b;
    // }
}

public class FinalMethod {
    public static void main(String args[]) {
        AdvanceCalculator obj = new AdvanceCalculator();
        int result = obj.add(23, 233);
        System.out.println(result);
    }
}
