import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        final int[] nums = new int[5];
        System.out.print("答辩小组成员：");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1+random.nextInt(34);
            System.out.print(nums[i] + " ");
        }
    }
}
