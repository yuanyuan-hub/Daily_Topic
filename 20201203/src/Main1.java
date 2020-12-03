import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        while (f2 < n) {
            f3 = f1+f2;//1  2  3
            f1 = f2;//1   1
            f2 = f3;//1  2
        }
        if(Math.abs(f1- n) > Math.abs(f2 - n)) {
            System.out.println(Math.abs(f2-n));
        }else  {
            System.out.println(Math.abs(f1-n));
        }
    }
}

