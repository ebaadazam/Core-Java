class Calculator { // if we make this calculator class as final then we cant create a sub class out
                   // of it and simply stopping inheritance
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
