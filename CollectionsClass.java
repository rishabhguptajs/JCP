import java.util.*;

class Student {
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));
        al.add(new Student(200, "NULL", 1230));

        for (Student s : al){
            System.out.println("Name: " + s.name + ", Roll No : " + s.rollno + ", Age: " + s.age);
        }

        Collections.sort(al, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("After sorting:");
        for (Student s : al){
            System.out.println("Name: " + s.name + ", Roll No : " + s.rollno + ", Age: " + s.age);
        }
    }
}
