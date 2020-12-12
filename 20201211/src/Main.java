import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println(10*30);
        long sum = 0;
        long count = 1;
        for(int i = 0;i < 30;i++) {
            sum = sum + count;
            count *= 2;
        }
        System.out.println(sum);
    }
}