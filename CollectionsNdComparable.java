// Here we are using Comparable to compare

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

// Main Class
public class CollectionsNdComparable {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(21, "Ebaad"));
        list.add(new Student(20, "Sehrish"));
        list.add(new Student(23, "Aashna"));
        list.add(new Student(19, "Nirvani"));

        list.sort(null);

        Iterator<Student> val = list.iterator();
        while (val.hasNext()) {
            System.out.println(val.next());
        }
    }
}
