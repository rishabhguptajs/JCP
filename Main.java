class Rectangle1{
    static int length;
    static int breadth;
    void calculateArea(int length, int breadth){
        System.out.println(length*breadth);
    }
}

class Rectangle2{
    int length;
    int breadth;
    int area;

    static void calculateArea(int length, int breadth){
        System.out.println(length*breadth);
    }

}

public class Main{
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Rectangle2 r2 = new Rectangle2();
        r1.calculateArea(2, 3);
        r2.length = 2;
        r2.breadth = 3;
    }
}