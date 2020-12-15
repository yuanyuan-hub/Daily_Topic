package lesson2;

public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            //中断以后
            public void run() {
                try {
                    for (int i = 0; i < 10000 && !Thread.currentThread().isInterrupted(); i++) {
                        System.out.println(i);
                        //模拟中断线程
                        Thread.sleep(1000);
                        //通过标志位自行实现，无法解决线程阻塞导致无法中断
                        //Thread.sleep(100000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        System.out.println("t start");
        //让t线程中断
        Thread.sleep(5000);
        t.interrupt();
        //告诉t线程，要中断了（设置t线程的中断标志位为true），由t的代码自行决定要不要中断
        //如果t线程处于阻塞状态，
        System.out.println("t stop");
    }

}
