package Project.PackageProject.Logic;

import Project.PackageProject.Entity.Employee;

// Write a program in java with the help of packages having a class employee in package 'entity'. Create another package with name 'logic' and a class 'employeeDAO' in it. Create another package wth name 'UI' with class name 'View' and main method in class 'View'. Take input through scanner class in class View, and scan employee ID. Display the salary of the employee having the input employee ID. 

// EmployeeDAO means Employee Data Access Object


public class EmployeeDAO {
    public static void getSalary(int id, Employee[] emp){
        for (Employee employee : emp) {
            if (employee.getId() == id) {
                System.out.println("Salary of employee with ID " + id + " is " + employee.getSalary());
            }
        }
    }
}
