import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int count = 0;
        for(int i = 0;i < str1.length();i++) {
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

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int count = 0;
        for(int i = 0;i <= A.length();i++) {
            StringBuffer str = new StringBuffer(A);
            str.insert(i,B);
            if(isPalindrome(str.toString())== true) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String str) {
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