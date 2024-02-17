// Record Class in java
record Alien(int no, String name) {

    // static variable
    static String admin = "Ebaad Azam";

    // Constructor
    public Alien(int no, String name) {
        this.no = no;
        this.name = name;

        if (no < 10) {
            throw new IllegalArgumentException("No. should be greater than 10");
        }

        if (name.startsWith("z")) {
            throw new IllegalAccessError("Name should not start with z");
        }
    }

    // Static Method
    public static String clg() {
        return "TMU PVT LTD";
    }

    // Non-Static Method
    public int countGrade(int grade) {
        grade += 1;
        return grade;
    }
}

public class RecordClass {
    public static void main(String[] args) {
        Alien obj1 = new Alien(12, "Ebaad");
        Alien obj2 = new Alien(12, "Ebaad");
        Alien obj3 = new Alien(30, "Kelly");

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj2.equals(obj3)); // false

        System.out.println(Alien.clg());

        Integer res = obj1.countGrade(10);
        System.out.println(res);

        System.out.println(Alien.admin);

    }
}