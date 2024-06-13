package Project.PackageProject.UI;

import Project.PackageProject.Entity.Employee;
import Project.PackageProject.Logic.EmployeeDAO;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];
        emp[0] = new Employee(1, "Rishabh", "Manager", 50000);
        emp[1] = new Employee(2, "GUPTAAAA", "Developer", 40000);
        emp[2] = new Employee(3, "RISHABH", "Tester", 30000);
        emp[3] = new Employee(4, "j", "Tester", 60000);
        emp[4] = new Employee(5, "k", "Tester", 3021000);
        emp[5] = new Employee(6, "l", "Tester", 301000);
        emp[6] = new Employee(7, "m", "Tester", 340000);
        emp[7] = new Employee(8, "n", "Tester", 36000);
        emp[8] = new Employee(9, "o", "Tester", 33000);
        emp[9] = new Employee(10, "p", "Tester", 20000);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        EmployeeDAO.getSalary(id, emp);
    }
}

// methods to add - display all employees, update employee details using id.
// generate a jar file, and run it using command line.