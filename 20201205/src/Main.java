import com.sun.org.apache.regexp.internal.RE;

import java.util.*;
//无缓存交换
public class Main {
    public static void main(String[] args) {
        int[] AB = {1,2};
        System.out.println(exchangeAB(AB));
    }
    public static int[] exchangeAB(int[] AB) {
        // write code here
      AB[0] = AB[0] + AB[1];//3
      AB[1] = AB[0] - AB[1];//3-2=1
        AB[0] = AB[0] - AB[1];//2
        System.out.println(AB);
        return AB;
    }
}