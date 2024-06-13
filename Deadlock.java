class ThreadA extends Thread{
    int sum = 0;
    public void run(){
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + " " + sum);
            }
            notify();
        }
    
}

public class Deadlock {
    public static void main(String[] args) throws Exception{
        // wait() and notify() methods are used to implement inter-thread communication in Java.
        // wait() method is used to pause the current thread until another thread calls notify() or notifyAll() method.
        // notify() method is used to wake up a single thread that is waiting for the object lock.

        ThreadA a = new ThreadA();
        a.start();
        synchronized (a) {
            System.out.println("Main thread trying to call wait() method");
            a.wait();
            System.out.println("Main thread got notification call");
            
        }
    }
}


// 2 thread banane hain, ek thread earnings calculate karega jitne tickets beche, dusra ticket bechne wala thread hoga, jitne tickets bechega utne earnings calculate karega.