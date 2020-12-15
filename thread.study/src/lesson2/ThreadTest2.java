package lesson2;

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            final int n = i;
            //new Thread 稍微有点耗时
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {//内部类使用外部的变量，必须是final修饰
                    System.out.println(n);
                }
            });
            t.start();
            //t.join();//一个启动后并等待执行完，再启动并等待执行完下一个
        }

//        while (Thread.activeCount() > 1) {//实际工作不会这么用，学习时简单达到：子线程执行完，再执行主线程代码
//           Thread.yield();//让当前线程让步，从运行态转变为就绪态
//        }
        for(Thread t : threads) {//同时执行20个线程，再等待所有线程执行完毕
            t.join();
        }
        System.out.println("ok");
    }
}


