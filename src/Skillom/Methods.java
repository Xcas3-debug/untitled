package Skillom;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Methods {
//    public static void main(String[] args) {
//        printCurrentDateTime();
//

    //    }
//    public static void printCurrentDateTime() {
//        System.out.println("Дата и время: ");
//
//        System.out.println(LocalDateTime.now());
//
//    }
    //   *************
//    public static void main(String[] args) {
//        iterate();
//    }
//
//    public static int i = 0;
//    public static int max = 10;
//
//    public static void iterate() {
//        if (i < max) {
//            i = i + 1;
//            System.out.println(i);
//            iterate();
//
//        }
//    }
//**********
//    public static void main(String[] args) {
//
//        System.out.println("Введите число и нажмите <Enter>: ");
//        double value = new Scanner(System.in).nextDouble();
//        square(value);
//    }
//
//    public static void square(double value){
//        System.out.println(value * value);

//*******************
//    public static void main(String[] args) {
//        calculateTriangleSquare(3,4,5);
//
//    }
//
//        public static void calculateTriangleSquare
//                (double a,double b, double c) {
//            double p = (a + b + c) / 2;
//            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//
//            System.out.println(square);
//        }

//********************

    //        public static void main(String[] args) {
//            int sum = calculateSum(300, 200, 700);
//            System.out.println(sum);
//        }
//        public static int calculateSum(int a, int b, int c) {
//            int sum = a + b + c;
//            return sum;
////return a+b+c;
//
//        }
    //*****************
    public static void main(String[] args) {
        int maxNumber = max(300, 10);
        System.out.println(maxNumber);
    }

    public static int max(int a, int b) {
//        if (a >= b) {
//            return a;
//        }
//        return b;
        return a >= b ? a : b;
    }
        //********************************************




    }





