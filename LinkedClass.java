// import java.util.Comparator;
import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.Set;
// import java.util.TreeSet;
// import java.util.Vector;

class Employee {
    int id;
    int salary;
    String name;

    public Employee(int id, int salary, String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
}

public class LinkedClass {
    public static void main(String[] args) {
        HashSet<Employee> hs = new HashSet<Employee>();

        hs.add(new Employee(1, 120000, "Rishabh"));

        for(Employee e : hs) {
            System.out.println("Name: " + e.name + " Salary: " + e.salary + " Id: " + e.id);
        }
    }
}