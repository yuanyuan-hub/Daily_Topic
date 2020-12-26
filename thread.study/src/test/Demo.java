package test;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

                }
            });
            System.out.print(i + " ");
            thread.start();
        }
        System.out.println();
        System.out.println("ok");
    }
}
