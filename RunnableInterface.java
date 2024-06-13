class MyThread implements Runnable {
    String name;
    public MyThread(String name){
        super();
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + i);
            System.out.println(this.name + " is running >>" + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("BMW"));
        Thread t2 = new Thread(new MyThread("Supra"));
        Thread t3 = new Thread(new MyThread("Porshe"));

        t1.start();
        t2.start();
        t3.start();
    }
}

// Which is better to use, Runnable or Thread? Why?
// Runnable is better to use than Thread because it is more flexible and can be used with other classes. 
// It is also better to use Runnable because it can be used to implement multiple inheritance in Java.
