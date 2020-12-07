import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            String c = sc.next();
            for(int i = 0; i < x;i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 1; i < Math.ceil((double)x/2) -1; i++) {
                for (int j = 0; j < x; j++) {
                    if(j == 0 || j == x-1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < x; i++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}