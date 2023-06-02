package Skillom;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class odinone {
    public static void main(String[] args) {
        System.out.println("Дата и время:");
        System.out.println(LocalDateTime.now());

//бензаколонка FillingStation

        System.out.println("Система расчета стоимости топлива");

        int fuelType = new Scanner(System.in).nextInt();
        int amount = 600;
         boolean hasDiscount = amount > 50; //если будет true
// var автоматически определяет тип переменной
        int maxAmount = 400;
        System.out.println(fuelType);
        double fuel92Price = 60.2;
        double fuel95Price = 67.33;
        double fuelPrice = 0;
        double discount = 0.1;

        String wrongFuelTypeMessage = "Указан неверный тип топлива:";

        if (fuelType == 92) {
            fuelPrice = fuel92Price;
        }
        else if (fuelType == 95) {
            fuelPrice = fuel95Price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if(amount < 1){
            System.out.println("Указан слишшком малое кол топлива");
            amount = 0;
        }

        if (hasDiscount){
            fuelPrice = fuelPrice - discount * fuelPrice;

        }

        if (amount > maxAmount){
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = maxAmount;
        }
        System.out.println("Цена выбрпного топлива: " + fuelPrice + " РУБ");

        String fuelPriceMassage ="Цена выбранного топлива: " + fuelPrice +" руб ";
        System.out.println(fuelPriceMassage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }

}
