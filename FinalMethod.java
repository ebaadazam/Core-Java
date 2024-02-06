class Calculator {
    // when we make this add method as final then we cant override it using a sub
    // class, if you remove final keyword then you can
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvanceCalculator extends Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class FinalMethod {
    public static void main(String args[]) {
        AdvanceCalculator obj = new AdvanceCalculator();
        int result = obj.add(23, 233);
        System.out.println(result);
    }
}
