// class name employ, 4 attributes banane hai, 1 methods honge which are the information of employ

// public class employee {
//     String name;
//     int age;
//     String city;
//     String country;
//     double salary;

//     employee(String n, int a, String c, String co, double s) {
//         this.name = n;
//         this.age = a;
//         this.city = c;
//         this.country = co;
//         this.salary = s;
//     }

//     void getEmployeeInfo() {
//         System.out.println("Name: " + name + " Age: " + age + " City: " + city + " Country: " + country + " Salary: " + salary);
//     }

//     static employee findHighestPaidEmployee(employee[] employees) {
//         employee highestPaidEmployee = employees[0];
//         for (int i = 1; i < employees.length; i++) {
//             if (employees[i].salary > highestPaidEmployee.salary) {
//                 highestPaidEmployee = employees[i];
//             }
//         }
//         return highestPaidEmployee;
//     }

//     public static void main(String[] args) {
//         employee e1 = new employee("Employee1", 25, "City1", "Country1", 50000);
//         employee e2 = new employee("Employee2", 30, "City2", "Country2", 60000);
//         employee e3 = new employee("Employee3", 35, "City3", "Country3", 55000);
//         employee e4 = new employee("Employee4", 28, "City4", "Country4", 70000);
//         employee e5 = new employee("Employee5", 32, "City5", "Country5", 75000);
//         employee e6 = new employee("Employee6", 27, "City6", "Country6", 65000);
//         employee e7 = new employee("Employee7", 29, "City7", "Country7", 80000);
//         employee e8 = new employee("Employee8", 31, "City8", "Country8", 72000);
//         employee e9 = new employee("Employee9", 26, "City9", "Country9", 68000);
//         employee e10 = new employee("Employee10", 33, "City10", "Country10", 85000);

//         employee[] employees = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};

//         employee highestPaidEmployee = findHighestPaidEmployee(employees);

//         System.out.println("Highest Paid Employee: ");
//         highestPaidEmployee.getEmployeeInfo();
//     }
// }

// create an abstract method

// abstract class Shape {
//     abstract void draw();
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing Circle");
//     }
// }

// native method is 

// strictfp is a keyword in java, it restricts floating point calculations to ensure portability.

// class employee {
//     strictfp void calculate() {
//         float a = 10.0f;
//         float b = 3.0f;
//         float c = a / b;
//         System.out.println(c);
//     }

//     public static void main(String[] args) {
//         employee obj = new employee();
//         obj.calculate();
//     }
// }