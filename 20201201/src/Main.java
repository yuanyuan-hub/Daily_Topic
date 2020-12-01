import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(sc.nextInt());
        }
        int k = list.get(list.size() - 1);
        int[] arr = new int[list.size()];
        for(int i = 0;i < list.size();i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for(int i = 0;i < k; i++ ) {
            if(i == (k-1)) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] +" ");
            }
        }
    }
}