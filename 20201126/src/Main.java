import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(need(n));
    }

    private static int need(int n) {
        for (int i = 0; i <= n/6 ; i++) {
            for (int j = 0; j <= n/8; j++) {
                if(i*6+j*8 == n) {
                    return i+j;
                }
            }
        }
        return -1;
    }
}
