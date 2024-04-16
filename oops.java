// inheritance 

// class A {
//     int i, j;
//     void showij() {
//         System.out.println("i and j: " + i + " " + j);
//     }
// }

// class B extends A {
//     int k;
//     void showk() {
//         System.out.println("k: " + k);
//     }
//     void sum() {
//         System.out.println("i + j + k: " + (i + j + k));
//     }
// }

// polymorphism
// it is the ability of a single function to perform different tasks


// example of polymorphism

// class A {
//     void callme() {
//         System.out.println("Inside A's callme method");
//     }
// }

// class B extends A {
//     void callme() {
//         System.out.println("Inside B's callme method");
//     }
// }

// abstraction
// abstraction is a process of hiding the implementation details and showing only functionality to the user

abstract class A {
    abstract void callme();
}

class B extends A {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}


public class oops {
    public static void main(String[] args) {
        // A superOb = new A();
        // B subOb = new B();

        // superOb.i = 10;
        // superOb.j = 20;
        // System.out.println("Contents of superOb: ");
        // superOb.showij();
        // System.out.println();

        // subOb.i = 7;
        // subOb.j = 8;
        // subOb.k = 9;
        // System.out.println("Contents of subOb: ");
        // subOb.showij();
        // subOb.showk();
        // System.out.println();
        // System.out.println("Sum of i, j, and k in subOb: ");
        // subOb.sum();

        // A a = new A();
        // B b = new B();

        // a.callme();
        // b.callme();

        A a = new B();
        a.callme();
    }
}
