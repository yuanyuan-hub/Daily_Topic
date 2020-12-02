public class Main {

    String str = new String("hello");
    char[] ch ={'a','b'};
    public static void main(String[] args) {
        Main ex = new Main();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
        /*
        int a = 0;
        Integer b = new Integer(0);
        System.out.println(a==b);
        System.out.println(b.equals(a));
        String x = "fmn";
        x.toUpperCase();
        System.out.println(x);

         */
    }

    private void change(String str, char[] ch) {
        str ="test ok";
        ch[0] = 'c';
    }

}
