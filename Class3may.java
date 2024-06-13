interface Movable{
    void start();
    void applyBrakes();
    void accelerate();
    void stop();
}

class Employee{
    int salary;
    String name;
    int age;

    public Employee(int salary, String name, int age){
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    void getDetails(){
        System.out.println("The salary of " + name + " is " + salary + ", and his age is " + age);
    }
}

class Car implements Movable{
    @Override
    public void start(){
        System.out.println("Car started!!");
    }
    @Override
    public void applyBrakes(){
        System.out.println("Brakes applied in car!!");
    }
    @Override
    public void accelerate(){
        System.out.println("Car is accelerating!!");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped!!");
    }
}

class Bike implements Movable{
    @Override
    public void start(){
        System.out.println("Bike started!!");
    }
    @Override
    public void applyBrakes(){
        System.out.println("Brakes applied in bike!!");
    }
    @Override
    public void accelerate(){
        System.out.println("Bike is accelerating!!");
    }
    @Override
    public void stop(){
        System.out.println("Bike stopped!!");
    }
}

class Train implements Movable{
    @Override
    public void start(){
        System.out.println("Train started!!");
    }
    @Override
    public void applyBrakes(){
        System.out.println("Brakes applied in train!!");
    }
    @Override
    public void accelerate(){
        System.out.println("Train is accelerating!!");
    }
    @Override
    public void stop(){
        System.out.println("Train stopped!!");
    }
}


public class Class3may {
    public static void main(String[] args) {
        // Car car = new Car();
        // Bike bike = new Bike();
        // Train train = new Train();

        // car.start();
        // car.accelerate();
        // car.applyBrakes();
        // car.stop();

        // bike.start();
        // bike.accelerate();
        // bike.applyBrakes();
        // bike.stop();

        // train.start();
        // train.accelerate();
        // train.applyBrakes();
        // train.stop();

        Employee emp1 = new Employee(1, "Pulkit", 20);
        emp1.getDetails();
    }
}
