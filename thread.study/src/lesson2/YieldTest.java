package lesson2;

public class YieldTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            final int n = i;
            //子线程休眠三秒之后同时无序执行（系统调度）
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {//内部类使用外部的变量，必须是final修饰
                    try {
                        Thread.sleep(3000);
                        System.out.println(n);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
        System.out.println("ok");
    }
}
