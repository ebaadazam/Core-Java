// Here we are using Comparator to compare

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class CollectionsNdComparator {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                // This will sort the Students on the basis of their age in ascending order
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(21, "Ebaad"));
        list.add(new Student(20, "Sehrish"));
        list.add(new Student(23, "Aashna"));
        list.add(new Student(19, "Nirvani"));

        list.sort(com);

        Iterator<Student> val = list.iterator();
        while (val.hasNext()) {
            System.out.println(val.next());
        }
    }
}
