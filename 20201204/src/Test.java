public class Test {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
       Test ex = new Test();
       ex.change(ex.str,ex.ch);
        System.out.println(ex.str+" and ");
        System.out.println(ex.ch);

        /*
        java.util.HashMap map = new java.util.HashMap();
        map.put("name",null);
        map.put("name","Jack");
        System.out.println(map.size());
         */
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }
}
