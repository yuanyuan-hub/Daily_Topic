package lesson3;

import javafx.concurrent.Task;

import java.time.temporal.Temporal;

public class SynchronizedTest2 {
    /**
     * 有一个教室，座位有50个，同时有三个老师安排同学的座位
     * 每个老师安排100个同学到这个教室，模拟使用多线程实现，
     * 座位编号0-49，三个线程同时启动来安排同学，有100个同学
     * 同学可以循环操作来安排
     * 执行到座位安排满结束
     */

    /*
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t1 = new Thread(thread,"A");
        Thread t2 = new Thread(thread,"B");
        Thread t3 = new Thread(thread,"C");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread implements Runnable{
    private static int zuowei = 50;
    @Override
    public void run() {
        for (int i = 100; i > 0 ; i--) {
            synchronized (this) {
                if(zuowei > 0) {
                    zuowei--;
                    System.out.println(Thread.currentThread().getName()+",还有"+this.zuowei);
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

     */


    public static void main(String[] args) {
        Task t = new Task();
        for (int i = 0; i < 3; i++) {
            new Thread(t).start();
        }
    }
    private static class Task implements Runnable{
        private static int count = 50;
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                synchronized (this) {
                    if(count > 0){
                        count--;
                        System.out.println(Thread.currentThread().getName()+":"+this.count);
                    }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
