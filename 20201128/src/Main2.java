import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String str = scanner.nextLine();
            String[] sp = str.split(" ");
            int[] arr = new int[sp.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(sp[i]);
            }
            System.out.println(func(arr,arr.length));
        }
    }

    private static Integer func(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    if(count >= length/2) {
                        return arr[i];
                    }
                }
            }
        }

        return null;
    }
}


