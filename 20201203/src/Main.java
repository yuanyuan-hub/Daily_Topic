public class Main {
    public int add(int a,int b) {
        try {
            return a+b;
        }
        catch (Exception e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        return 0;
    }
    public static void main(String[] args) {
        try {
            int i = 100/0;
            System.out.println(i);
        }
        catch (Exception e) {
            System.out.println(1);
            throw new RuntimeException();
        }
        finally {
            System.out.println(2);
        }
        System.out.println(3);
//        Main main = new Main();
//        System.out.println("heshi"+main.add(9,34));
        /*
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));

         */
    }
}
