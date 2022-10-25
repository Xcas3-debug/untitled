package lr2;
import java.util.Scanner;
public class example21_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое число, для проверки, делится ли оно на 3 ");
        int x = in.nextInt();

        if (x % 3 == 0) System.out.println("Введенное вами число делится на 3 без остатка");
        else System.out.println("Введенное вами число не делится на 3 без остатка");

    }
}