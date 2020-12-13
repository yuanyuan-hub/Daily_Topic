package lesson1;

public class InnerClass {
    public static void main(String[] args) {
        //匿名内部类:只是重新定义了一个A的子类，重写了方法
        A a = new A() {
            @Override
            public void x() {
                System.out.println("Y");
            }
        };
    }
    //静态内部类，和普通类使用没什么区别，只需要明确是哪个类的内部类。
    //其他包使用：InnerClass.A
    public static class A{
        public void x(){
            System.out.println("A");
        }
    }
}
