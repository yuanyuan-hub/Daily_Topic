package test;

public class threeThreads {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt,"A");
        Thread t2 = new Thread(mt,"B");
        Thread t3 = new Thread(mt,"C");
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());
    }
}
