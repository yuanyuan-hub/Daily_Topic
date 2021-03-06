import java.util.*;


public class Solution {
    /**
     * 反转字符串
     * @param str string字符串
     * @return string字符串
     */
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(solve(str));
    }

    public static String solve(String str) {
        // write code here
        char[] c = str.toCharArray();
        for (int i = 0,j = str.length() - 1; j >= i ; i++,j--) {
            char a = c[i];
            c[i] = c[j];
            c[j] = a;
        }
        return new String(c);
    }
}