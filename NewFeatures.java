

interface Inf{
    default public void test(){
        System.out.println("DEFAULT METHOD");
    }

    static void testStatic(){
        System.out.println("Static method!");
    }
}

class Temp implements Inf{
}

public class NewFeatures {
    public static void main(String[] args) {
        Temp t = new Temp();
        t.test();

        Inf.testStatic();
    }
}
