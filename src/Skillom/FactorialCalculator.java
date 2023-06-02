package Skillom;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
 int factorial = 1; // сохраняет результат переменной //2  6  24 6 24 120
        for (int i = 1; i <= value; i = i + 1) {
            //System.out.println(i + " i");
            factorial = i * factorial;
            //System.out.println(factorial + " f" );
      //1*1 2*1 3*2 3*6 4*24 5*120
        }
        System.out.println("Результат переменной: " + factorial);

    }
}
