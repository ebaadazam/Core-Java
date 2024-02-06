import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    String address;

    // Constructor
    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Overriding compareTo() method of Comparable Class
    @Override
    public int compareTo(Student that) {

        // Sorting on the basis of rollNo
        if (this.rollNo > that.rollNo) {
            return 1;
        } else {
            return -1;
        }
    }

    // String Representation using toString()
    @Override
    public String toString() {
        return "Student Name : Roll No : Address :: " + name + " : " + rollNo + " : " + address;
    }
}

class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student obj1 = new Student(12, "Ebaad", "Civil Lines");
        Student obj2 = new Student(19, "Aashna", "Civil Lines");
        Student obj3 = new Student(16, "Saima", "High Street");
        Student obj4 = new Student(10, "Sehrish", "MDA Colony");

        // Adding the objects into the list
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        list.sort(null); // sorting the list

        System.out.println(list);

        // Traverse the List
        Iterator<Student> value = list.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(12, "Ebaad", "Civil Lines"));
        // list.add(new Student(14, "Aashna", "Civil Lines"));
        // list.add(new Student(16, "Saima", "High Street"));
        // list.add(new Student(10, "Sehrish", "MDA Colony"));

    }
}