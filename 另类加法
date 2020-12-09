import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(addAB(a,b));
    }


        public static int addAB(int A, int B) {
            // write code here
            if( A == 0) {
                return B;
            }
            if(B == 0) {
                return A;
            }
            while(A != 0) {
                int tmp = 0;
                tmp = A&B;
                B = A^B;
                A = tmp << 1;
            }
            return B;
        }
    }
