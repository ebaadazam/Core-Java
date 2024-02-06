// Without using lambda expression but with Anonymous Class
interface Addition {
    int add(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {

        Addition obj = new Addition() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        int result = obj.add(10, 12);
        System.out.println(result);
    }
}

// Using Lambda Expression
// interface Addition {
// int add(int a, int b);
// }

// public class FunctionalInterface {
// public static void main(String[] args) {

// Addition obj = (int a, int b) -> a + b;
// int result = obj.add(10, 12);
// System.out.println(result);
// }
// }
