import java.util.*;
//个位数统计
public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String n = sc.nextLine();
        int[] count = new int[10];
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            count[c-'0']++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                System.out.println(i+":"+count[i]);
            }
        }
    }
}