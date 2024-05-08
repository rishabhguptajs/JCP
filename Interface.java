// interfaces are used to achieve multiple inheritance in java
// we cant create objects of interface
// the variables inside interface are by default public static final

// three methods in interface
// 1. abstract method - no body
// 2. default method - keyword default
// 3. static method - keyword static

interface Fly{
    public void startFlying();
    public void flyLow();
    public void flyHigh();

    static void test(){
        System.out.println("Static method in interface");
    }

    default void test2(){
        System.out.println("Default 1 method in interface");
    }

    default void test3(){
        System.out.println("Default 2 method in interface");
    }
}

class Bird implements Fly{
    public void startFlying(){
        System.out.println("Bird is flying");
    }
    public void flyLow(){
        System.out.println("Bird is flying low");
    }
    public void flyHigh(){
        System.out.println("Bird is flying high");
    }
}

public class Interface {
    
}
