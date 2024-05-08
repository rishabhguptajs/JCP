interface Inf{
    void print();
}

class A implements Inf{
    public void print(){
        System.out.println("Class A Method");
    }
}

class B implements Inf{
    public void print(){
        System.out.println("Class B Method");
    }
}

class Temp{
    void test(Inf i){
        i.print();
    }
}

public class May2 {
    public static void main(String[] args) {
        
    }
}
