import java.util.*;

public class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = func(n);
        int count = 0;
        System.out.println(x);
        while(x % 10 == 0){
            count++;
            x /=10;
        }
        System.out.println(count);
    }
    public static int func(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*func(n-1);
        }
    }
}