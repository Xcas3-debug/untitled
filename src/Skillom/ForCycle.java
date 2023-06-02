package Skillom;

import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();

        int result = 1;
        int res = 0;
        int ravno = 1;
        for (int i = 0; i <= value; i++) {
       //     System.out.println(i + " i");
            for (res = 0; res <= value; res++) {
              //  System.out.println(res + " res");
                if ( i * res == value) {
                    System.out.println(i + "*" + res + "=" + value);

                }

            }
        }

            // System.out.println(res + " res");


           // System.out.println("Результат переменной: ");

    }
}