import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
    int rollNo;
    String name;
    String address;

    // Constructor
    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // String Representation using toString()
    @Override
    public String toString() {
        return "Student Name : Roll No : Address :: " + name + " : " + rollNo + " : " + address;
    }
}

class ComparatorExample {
    public static void main(String[] args) {

        // Comparator
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.rollNo > j.rollNo) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> list = new ArrayList<Student>();

        Student obj1 = new Student(12, "Ebaad", "Civil Lines");
        Student obj2 = new Student(19, "John", "Civil Lines");
        Student obj3 = new Student(16, "Markey", "High Street");
        Student obj4 = new Student(10, "Joana", "MDA Colony");

        // Adding the objects into the list
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        // We could have also done it like this
        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(12, "Ebaad", "Civil Lines"));
        // list.add(new Student(14, "John", "Civil Lines"));
        // list.add(new Student(16, "Markey", "High Street"));
        // list.add(new Student(10, "Suhani", "MDA Colony"));

        list.sort(com); // sorting the list

        System.out.println(list);

        // Traverse the List
        Iterator<Student> value = list.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}

// Comparator using LAMBDA EXPRESSION

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
    int rollNo;
    String name;
    String address;
    int age;

    // Constructor
    public Student(int rollNo, String name, String address, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // String Representation using toString()
    @Override
    public String toString() {
        return "Student Name : Roll No : Address :: " + name + " : " + rollNo + " : "
                + address + " : " + age;
    }
}

class ComparatorExample2 {
    public static void main(String[] args) {

        // Comparator with lambda expression
        Comparator<Student> com = (i, j) -> i.rollNo - j.rollNo;

        List<Student> list = new ArrayList<Student>();

        Student obj1 = new Student(12, "Ebaad", "Civil Lines", 21);
        Student obj2 = new Student(19, "Aashna", "Civil Lines", 23);
        Student obj3 = new Student(16, "Saima", "High Street", 20);
        Student obj4 = new Student(10, "Sehrish", "MDA Colony", 18);

        // Adding the objects into the list
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        list.sort(com); // sorting the list

        System.out.println(list);

        // Traverse the List
        Iterator<Student> value = list.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}