// Outer Class
class OuterClass {

    static int var = 200; // Static variable
    private static int var2 = 400; // Private Static variable

    // Static Nested Class
    static public class InnerClass {

        // Non-Static Method
        void display() {
            System.out.println("The Content belongs to the Static Inner Class with Normal Method");
        }

        // Static Method
        static void show() {
            System.out.println("The Content belongs to the Static Inner Class with Static Method");
        }

        // Static Class can only access Static Members
        void getVar() {
            System.out.println("The Value of the Static Variable is " + var);
        }

        // Static Class can also access the Private Static Members
        void getVar2() {
            System.out.println("The Value of the Private Static Variable is " + var2);
        }
    }
}

class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass(); // This is how we create the instance of the Inner
                                                                 // Class
        // with the reference of the Outer Class
        obj.display();
        OuterClass.InnerClass.show(); // As show() is a static method so it should be called with the class name
        obj.getVar();
        obj.getVar2();
    }
}