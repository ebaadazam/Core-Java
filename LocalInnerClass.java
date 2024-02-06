// Outer Class
class OuterClass {

    int var1 = 100; // Instance Variavle
    static int var2 = 200; // Static variable
    private static int var3 = 400; // Private Static variable

    // Method of the Outer Class
    public void MethodOfOuterClass() {

        int methodVar = 1000;

        // Local Inner Class
        class InnerClass {

            void display() {
                System.out.println("The Content belongs to the Inner Class with Normal Method");
            }

            // We cant declare Static Methods inside Local Inner Class
            static void show() {
                System.out.println("The Content belongs to the Inner Class with Static Method");
            }

            void getVar1() {
                System.out.println("The Value of an Instance Variable is " + var1);
            }

            void getVar2() {
                System.out.println("The Value of the Static Variable is " + var2);
            }

            void getVar3() {
                System.out.println("The Value of the Private Static Variable is " + var3);
            }

            void getMethodVar() {
                System.out.println(
                        "The Value of the Inside Method Variable but outside Local Inner Class is " + methodVar);
            }

        }

        InnerClass obj = new InnerClass();
        obj.display();
        InnerClass.show(); // Static method can only be called with class name
        obj.getVar1();
        obj.getVar2();
        obj.getVar3();
        obj.getMethodVar();
    }
}

// Main Class
public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass obj2 = new OuterClass();
        obj2.MethodOfOuterClass();
    }
}
