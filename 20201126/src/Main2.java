import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            char[] a = new char[256];
            for (int i = 0; i < str2.length(); i++) {
                a[str2.charAt(i)] = 1;
            }
            for (int i = 0; i < str1.length(); i++) {
                if(a[str1.charAt(i)] != 1) {
                    sb.append(str1.charAt(i));
                }
            }
            System.out.println(sb);
    }
}

