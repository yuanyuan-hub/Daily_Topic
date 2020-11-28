//A,B,C三个人是好朋友，每个人手里都有一些糖果我们不知道他们每个人手上具体
//    有多少个糖果，但是我们知道以下的信息:
//    A-B,B-C,A+B, B + C.这四个数值每个字母代表每个人所拥有的糖果数

import java.util.Scanner;

public class Main3 {
    public static void main1(String[] args) throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String number[] = string.split(" ");
        int x1 = Integer.parseInt(number[0]);//A-B
        int x2 = Integer.parseInt(number[1]);//B-C
        int x3 = Integer.parseInt(number[2]);//A+B
        int x4 = Integer.parseInt(number[3]);//B+C
        int A = (x1+x3)/2;
        int B = (x2+x4)/2;
        int C = (x4 - x2)/2;
        if((x1+x3)%2 == 0 && (x2+x4)%2 == 0 && (A-B == x1)) {
            System.out.println(A+" " + B + " " + C);
        } else {
            System.out.println("No");
        }
    }
}