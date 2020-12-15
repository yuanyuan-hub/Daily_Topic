package lesson2;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        //t和main同时并发并行执行，但因为main线程正在运行态执行代码，很快执行后序代码
        //打印main和t,本来应该是乱序的，但是先打印main的概率非常高
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
            }
        });//申请系统创建线程t
        t.start();//申请系统执行线程t：创建态转变为就绪态，由系统决定什么时候转变为运行态
        t.join();//当前线程（main)无条件等待，直到t线程执行完毕，main线程再往后执行
        System.out.println("main");
    }
}
