package lesson3;

public class MethodArgument {

    //int i = 方法调用传入的值
    public static void swap(int a) {//swap方法栈帧
        a = 1;
    }

    //main线程，执行main方法（栈帧）
    public static void main(String[] args) {
        int i = 0;
        swap(i);
        System.out.println(i);
    }

    private static class User{
        private String username;
    }
}
