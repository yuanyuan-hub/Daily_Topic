import java.util.*;

public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x > 9) {
            int n = x;
            n %= 10;
            x = x/10;
            System.out.print(n);
        }
        System.out.println(x);
    }
}