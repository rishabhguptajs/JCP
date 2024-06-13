
// class Geometry{
//     int a;
//     int b;

//     public void add(int a, int b){
//         System.out.println(a+b);
//     }

//     public void add(int a, int b, int c){
//         System.out.println(a+b+c);
//     }
// }

// class InnerPolymorphism extends Geometry{
//     @Override
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }

// Polymorphism is the ability of a single function to operate on different data types. 
// It is the ability to redefine methods for derived classes.
// Polymorphism is a feature of OOPs that allows objects to be treated as instances of their parent class.

class A{
    void m1(){
        System.out.println("I'm in super class.");
    }
}

class B extends A{
    @Override
    void m1(){
        System.out.println("I'm in sub class.");
    }
}

class Subject{
    String name;
    int marks;

    public void details(String name, int marks){
        System.out.println("The subject is " + name + "and, your marks are " + marks);
    }
}

class Game extends Subject{
    String name;
    int marks;

    @Override
    public void details(String name, int marks){
        System.out.println("The game is " + name + "and your marks in it are " + marks);
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animal sound!!");
    }

    final void hehe(){
        System.out.println("System is final.");
    }
}

class Mammals extends Animal{
    void makeSound(){
        System.out.println("Mammal sound!!!");
    }

    // void hehe(){
    //     System.out.println("HEHE");
    // }

}
class Reptile extends Animal{
    public void makeSound(){
        System.out.println("Reptile sound!!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal hihi = new Mammals();

        animal1.makeSound();
        hihi.makeSound();
    }
}


// should not have more restricted access specifiers in super class.
// can't override the final method.
// constructors can't be overriden.
//  'single interface, multiple implementations' aspect of polymorphism
