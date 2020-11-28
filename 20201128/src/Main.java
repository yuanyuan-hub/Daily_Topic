import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String vowel = "AEIOUaeiou";
        while ((str = br.readLine()) != null) {
            if(vowel.indexOf(str) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}