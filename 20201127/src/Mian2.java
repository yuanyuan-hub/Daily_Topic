import java.util.Scanner;
public class Mian2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int count = 0;
            for(int i = 0;i <= str1.length();i++) {
                StringBuffer str = new StringBuffer(str1);
                str.insert(i,str2);
                if(IsHuiWen(str.toString())) {
                    count++;
                }
            }
            System.out.println(count);
        }
        public static boolean IsHuiWen(String str) {
            int i = 0;
            int j = str.length() - 1;
            while(i < j) {
                if(str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
