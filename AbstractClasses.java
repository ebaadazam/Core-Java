abstract class Shapes {
    int x, y;

    // We can also Create constructors of an abstract class
    public Shapes(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract methods Should be declared in Abstract class
    abstract void draw();

    abstract void resize();
}

class Circle extends Shapes {

    public Circle(int x, int y) {
        super(x, y);

    }

    void draw() {
        System.out.println("Draw Circle!");
    }

    void resize() {
        System.out.println("Resize Circle!");
    }

}

class Rect extends Shapes {

    public Rect(int x, int y) {
        super(x, y);
    }

    void draw() {
        System.out.println("Draw Rectangle!");
    }

    void resize() {
        System.out.println("Resize Rectangle!");
    }

}

public class AbstractClasses {
    public static void main(String[] args) {
        Shapes obj = new Circle(10, 20);
        obj.draw();
        obj.resize();

        Shapes obj2 = new Rect(11, 21);
        obj2.draw();
        obj2.resize();
    }

}
