
//Напишите программу с использованием цикла while, которая рассчитает и выведет в консоль
//время наполнения бассейна с учётом скоростей наполнения и опустоше
package Skillom;

public class SwimmingPool {
    public static void main(String[] args) {

        int volume = 1200;//обьём бассейна
        int currentVolume = 600;// текущий обьем бассейна

        int fillingSpeed = 30; //(влив)заполнение per minute
        int devastationSpeed = 10; //(вылив)опустошение в мин
        int iterations = 0,increaseValue,  fillingValue = 0;

        while (fillingValue < volume) {
            increaseValue = fillingSpeed - devastationSpeed;//кол-во набирается кажд минуту. увелЗначен
            iterations++;//итерация
           fillingValue += increaseValue; //кол заполнения литр

            if (currentVolume > volume) {
                System.out.println("Бассейн переполнен!");
                break;
            }

        }

            System.out.println("Заполнится за " + iterations + " минут"); // минут
    }
}
