import java.util.Scanner;
//链接：https://www.nowcoder.com/questionTerminal/9aaea0b82623466a8b29a9f1a00b5d35?f=discussion
//有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。
// John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。
// John可以从这些物品中选择一些，如果选出的物体的总体积是40，
// 那么利用这个神奇的口袋，John就可以得到这些物品。现在的问题是，John有多少种不同的选择物品的方式。
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(count(arr,n,40,0));
            break;
        }
    }

    private static int count(int[] arr, int n, int v, int index) {
        if(v == 0) {
            return 1;
        }
        if(n == 0) {
            return 0;
        } else {
            return count(arr,n-1,v-arr[index],index+1) + count(arr,n-1,v,index+1);
        }
    }
}
