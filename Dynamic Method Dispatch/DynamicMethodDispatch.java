class A {
    void display() {
        System.out.println("In A Class");
    }
}

class B extends A {
    void display() {
        System.out.println("In B Class");
    }
}

class C extends B {
    void display() {
        System.out.println("In C Class");
    }
}

// Main Class
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Dynamic Method Binding - Creating the object of Class C with the reference of
        // Class A
        A obj = new A(); // Irrespective of what type of variable(i.e, obj) you create, but it all
        // depends upon what object you have
        obj.display();

        obj = new B(); // we are creating the new object of the old reference and also obj is
                       // overwritten now by B
        obj.display();

        obj = new C(); // we are creating the new object of the old reference and also obj is
                       // overwritten now by C
        obj.display();
    }

}
