// constructors are used to initialize the object's state. Like methods, a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation. It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any. In such case, the class has no constructor. But if you have a constructor, java does not create a default constructor.

// constructor overloading is a concept in which we can create multiple constructors with different parameters. The constructor is called depending on the number and type of parameters passed.

// super keyword is used to call the constructor of the parent class. It is used to call the constructor of the parent class and can be used to access the parent class properties and methods.

// this keyword is used to refer to the current object in a method or constructor. It is used to refer to the current instance of the method or constructor. It is used to refer to the current object in a method or constructor.

class Rectangle {
    int width;
    int height;
    int area;

    Rectangle(int w, int h) {
        super();
        this.width = w;
        this.height = h;
        this.area = width * height;
    }
}

public class constructor{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("Area: " + r1.area);
    }
}