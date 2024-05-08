/*
 * Super Class(Parent) -> Sub Class(Child)
 * 
 * Super Class: Parent class
 * Sub Class: Child class
 * 
 * Inheritance:
 * 
 * 1. Single Inheritance
 * 2. Multi-Level Inheritance
 * 3. Hierarchical Inheritance
 * 4. Hybrid Inheritance
 * 
 * 
 * 
 */


 class Animal{
    int age;
    Boolean isMale;

    Animal(int age){
        this.age = age;
    }

    void displayAge(){
        System.out.println("Age: " + age);
    }

    void walk(){
        System.out.println("Walking...");
    }

    void eat(){
        System.out.println("Eating...");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }

    void run(){
        System.out.println("Running...");
    }
 }

 class Dog extends Animal{
    Dog(int age){
        super(age);
    }

    void bark(){
        System.out.println("Barking...");
    }

    void wagTail(){
        System.out.println("Wagging Tail...");
    }
 }

 class Cat extends Animal{
    Cat(int age){
        super(age);
    }
    void meow(){
        System.out.println("Meowing...");
    }

    void scratch(){
        System.out.println("Scratching...");
    }
 }

public class inheritance {
    public static void main(String[] args) {
        System.out.println("Dog has arrived!");
        Dog dog = new Dog(10);
        dog.displayAge();
        dog.walk();
        dog.eat();
        dog.sleep();
        dog.run();
        dog.bark();
        dog.wagTail();

        System.out.println();
        System.out.println("Cat has arrived!");
        Cat cat = new Cat(9);
        cat.walk();
        cat.eat();
        cat.sleep();
        cat.run();
        cat.meow();
        cat.scratch();
    }
}