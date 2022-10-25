package lr2;
import java.util.Scanner;
public class example15_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число:");
        int a = in.nextInt();
        if (a%4 == 0) {
            System.out.println("Делится на 4 без остатка");
        }
        else {
            System.out.println("Делится на 4 с остатком");
        }
        if (a > 10) {
            System.out.println("Число больше 10");
        }
        else {
            System.out.println("Число меньше или равно 10");
        }
    }
    }
