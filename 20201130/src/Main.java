import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A % B == 0 || A == B) {
            System.out.println(A);
        } else if(B % A == 0) {
            System.out.println(B);
        } else {
            int x = Math.max(A,B);
            while(x%A != 0 || x%B != 0) {
                x++;
            }
            System.out.println(x);
        }
    }
}