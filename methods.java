
class Demo{
    public static final int myMethod(int a, int b, String str){
        System.out.println(str);
        return a+b;
    }
}

public class methods {
    public static void main(String[] args) {
        System.out.println(Demo.myMethod(10, 20, "Hello"));
    }
}
