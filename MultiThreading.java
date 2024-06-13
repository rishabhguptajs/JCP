class MyThread extends Thread{
    String name;
    public MyThread(String name){
        super();
        this.name = name;
    }



    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
            System.out.println("Priority: " + this.getPriority());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("BMW");
        MyThread t2 = new MyThread("Supra");
        MyThread t3 = new MyThread("Porshe");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }
}
