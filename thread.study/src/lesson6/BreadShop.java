package lesson6;

/**
 * 面包店
 * 升级版需求：面包师傅每个最多生产30次：面包店每天生产10*30=900个
 *          消费者不再一直消费,把900个面包消费完结束
 */

public class BreadShop {

    private static int NUMBER;
    private static int COUNT;
    //消费者
    public static class  Consumer implements Runnable{

        private String name;

        public Consumer(String name) {
            this.name = name;
        }


        @Override
        public void run() {
            //一直消费
            try {
                while (true) {
                    synchronized (BreadShop.class) {
                        //库存到达下限，不能继续消费，需要阻塞等待
                        if(COUNT == 0 || NUMBER >= 900) {
                            BreadShop.class.wait();//释放对象锁
                        } else {
                            //库存 > 0 ，允许消费
                            System.out.printf("消费者 %s 消费了一个面包\n",name);
                            COUNT--;
                            //通知BreadShop.class.wait();代码进入阻塞的线程
                            BreadShop.class.notifyAll();
                            Thread.sleep(100);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    //生产者
    public static class Producer implements Runnable{

        private String name;

        public Producer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            //一直生产
            try {
                while (true) {
                    synchronized (BreadShop.class) {
                        //生产到达上限，不能继续生产，需要阻塞等待
                        if(COUNT + 3 > 100 || NUMBER >= 90) {
                            BreadShop.class.wait();//释放对象锁
                        } else {
                            //库存满足生产条件
                            System.out.printf("生产者 %s 生产了3个面包\n",name);
                            COUNT += 3;
                            NUMBER += 3;
                            //通知BreadShop.class.wait();代码进入阻塞的线程
                            BreadShop.class.notifyAll();
                            Thread.sleep(100);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //同时启动20个消费者线程
        Thread[] consumer = new Thread[20];
        for (int i = 0; i < 20; i++) {
            consumer[i] = new Thread(new Consumer(String.valueOf(i)));
        }

        //同时启动10个生产者
        Thread[] producers = new Thread[20];
        for (int i = 0; i < 10; i++) {
            producers[i] = new Thread(new Producer(String.valueOf(i)));
        }

        for (int i = 0; i < 20; i++) {
            consumer[i].start();
        }

        for (int i = 0; i < 10; i++) {
            producers[i].start();
        }
    }
}
