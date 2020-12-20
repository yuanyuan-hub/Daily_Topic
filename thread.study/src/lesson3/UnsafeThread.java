package lesson3;

/**
 * count++
 * 1.方法区（线程共享区域），count变量复制到线程工作内存
 * 2.count变量值在工作内存修改为count+1
 * 3.写回主内存
 */
public class UnsafeThread {

    //有一个变量 COUNT = 0;同时启动20个线程，每个线程循环1000次，每次循环count++
    //等待20个子线程执行完毕后，在main线程打印count值（预期）
    private static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        //尽量同时启动，不要newThread耗时影响
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        count++;
                    }
                }
            });
        }
        //全部启动
        for(Thread t : threads) {
            t.start();
        }
        //让main线程阻塞等待所有20个子线程执行完毕
        for(Thread t : threads) {
            t.join();
        }
        System.out.println(count);
    }
}
