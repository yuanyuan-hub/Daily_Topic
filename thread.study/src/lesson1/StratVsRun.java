package lesson1;

public class StratVsRun {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                }
            }
        }).run();
        /**
         * main线程直接调用Thread对象的run方法，会直接在main线程运行Thread对象的run()-->
         * 传入的runnable对象.run()
         * 结果就是：main线程直接运行while(true)
         */
    }
}
