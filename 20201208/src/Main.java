import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        //判断是否有0，如果没有0，则依次输出个数不为0的数字，直到该数字个数为0为止。
        if(arr[0]==0){
            for(int i=0;i<10;i++){
                while(arr[i]>0){
                    System.out.print(i);
                    arr[i]--;
                }
            }
        }else{
            //如果有数字0，则先查找第一个数字不为0的数字，输出并个数--。
            // 其次输出所有的0，最后再从1开始，依次输出个数不为0的数字，直到该数字个数为0为止。
            for(int i=1;i<10;i++){
                if(arr[i]!=0){
                    System.out.print(i);
                    arr[i]--;
                    break;
                }
            }
            while(arr[0]>0){
                System.out.print(0);
                arr[0]--;
            }
            for(int i=1;i<10;i++){
                while(arr[i]>0){
                    System.out.print(i);
                    arr[i]--;
                }
            }
        }
    }
}