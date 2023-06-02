package Skillom;


import java.util.Scanner;

public class WhiteDo {
    public static void main(String[] args) {
//        while (true) {
//            System.out.println("Текст будет выводить постоянно");
//        }
        int value = -1;
        int sum = 0;


        while (value != 0) {  
            System.out.println("Введите число и нажмите <Enter> или 0 для сброса суммы: ");
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }
        System.out.println("Сумма введёных чисел равна: " + sum);


      int sum1 = 0;
        for (int value1 = -1; value1 != 0; ){
            value1 = new Scanner(System.in).nextInt();
            sum1 = sum1 + value1;
        }
        System.out.println("Сумма введёных чисел равна: " + sum1);



        int SecretPassword =7576;
        int pincode = -1;
        while (pincode != SecretPassword) {  //true,продолж до тех пор, пока условие станет false

            if (pincode == -1) {
                System.out.println("Введите PIN-код");
            } else {
                System.out.println("Пин код неверный");
            }
            pincode = new Scanner(System.in).nextInt();
        }
        System.out.println("Пин код введён верно");

//        do {
//
//        }
//        while ();



    }

}