package Skillom;

import java.util.Scanner;

public class chicleFo {
    public static void main(String[] args) {
//        int i;
//        for (i = 15; i <= 40; i = i + 1) {
//            System.out.println(i);
//            if (i == 16) {
//                System.out.println("ВЫ можете обучатся на вождения");
//            }
//        }

        for (int i = 20; i > 0; ) {  //обрптныцй отсчет
            i = i - 1;
            System.out.println(i);

        }
        System.out.println("только чётные: ");
        for (int i = 0; i <= 20; i = i + 2) { //только чётные числа, если i=1 то нечетные
            System.out.println(i);
        }

        for ( int i = 9; i > 3; i = i - 1 ) {
            System.out.println(i);

        }


        for (; ; ) {  // бесконечный цикл
            System.out.println("Введите первое число:");
            int value1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число:");
            int value2 = new Scanner(System.in).nextInt();
            int result = value1 * value2;
            System.out.println("Произведение чисел равно: " + result);
        }

    }
}
