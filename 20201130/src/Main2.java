import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= W-1; i++) {
            for (int j = 0; j <= H-1; j++) {
               // double x = (i-(i+1))*(i-(i+1))+(j-(j+1))*(j-(j+1));
                if(Math.sqrt((i-(i+1))*(i-(i+1))+(j-(j+1))*(j-(j+1))) != 2) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
