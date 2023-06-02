package ObjectsAndMethods1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число:");
        int num2 = new Scanner(System.in).nextInt();

        Arithmetic ar = new Arithmetic(num1,num2);

        System.out.println("сумма чисел " + num1 + " и " + num2 + " = " + ar.sum());
        System.out.println("произведение чисел " + num1+ " и " + num2 + " = " + ar.mul());
        System.out.println("максимальное из чисел " + num1 + " и " + num2 + " = " + ar.max());
        System.out.println("минимальное из чисел " + num1 + " и " + num2 + " = " + ar.min());

    }
}

