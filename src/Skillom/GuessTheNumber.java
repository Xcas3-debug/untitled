package Skillom;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Загадайте число:");


        int range = 100;
        int value = (int)(Math.random() * range);
        System.out.println("Рандомное число: " + value);
        int attemp;
        while (true) {
            System.out.println("Угодайте число от 0 до " + range);
            attemp = new Scanner(System.in).nextInt();
            if (attemp == value) {
                System.out.println("Вы угадали!");
                break;
            }

            if (attemp > value) {
                System.out.println("Загаданное число больше");
            } else  {
                System.out.println("Загаданное число меньше");
            }

        }


    }
}




