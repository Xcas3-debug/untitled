package lr2;
import java.util.Scanner;
public class example15_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, для проверки на удовлетворение критериям: - (попадает ли введенное число в диапазон от 5 до 10 включительно) ");
        int x = in.nextInt();

        if (5 <= x & x <= 10) System.out.println("Введенное вами число удовлетворяет критериям");
        else System.out.println("Введенное вами число не удовлетворяет критериям");
    }
}