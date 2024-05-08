// Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

// To achieve encapsulation in Java −
// Declare the variables of a class as private.
// Provide public setter and getter methods to modify and view the variables values.
// atleast a no-argument constructor is required to create an object of the class.
// class should implement Serializable interface.
// Serialization interface means that you can convert an object of the class into a sequence of bytes, which can be persisted to a file or database or can be sent over the network to any other machine.

// Example of Encapsulation
// In this example, we have a class EncapsulationClass which have two private variables name and age. We are using setter methods to set the values of these variables and getter methods to get the values of these variables.

import java.io.Serializable;

class EncapsulationClass{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class Encapsulation implements Serializable{
    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();
        obj.setName("Rishabh");
        obj.setAge(18);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
