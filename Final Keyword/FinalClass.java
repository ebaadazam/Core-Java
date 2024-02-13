/*
 * If we declare the Calculate Class as final then we cannot be able to extend this class further. 
 * Hence the Inheritance will simply be stopped if we use final keyword
 */

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvanceCalculator extends Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class FinalClass {
    public static void main(String args[]) {
        AdvanceCalculator obj = new AdvanceCalculator();
        int result = obj.add(23, 233);
        System.out.println(result);
    }
}
