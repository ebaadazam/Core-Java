import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// In case of comparable, we implement it in the class
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
        Student obj2 = new Student(19, "John", "Civil Lines");
        Student obj3 = new Student(16, "Joana", "High Street");
        Student obj4 = new Student(10, "Santia", "MDA Colony");

        // Adding the objects into the list
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        list.sort(null); // sorting the list

        System.out.println(list); // it will just print the list in one line which is not good

        // Traverse the List, we also could have used enhanced for loop
        Iterator<Student> value = list.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(12, "Ebaad", "Civil Lines"));
        // list.add(new Student(14, "John", "Civil Lines"));
        // list.add(new Student(16, "Archie", "High Street"));
        // list.add(new Student(10, "Santia", "MDA Colony"));

    }
}