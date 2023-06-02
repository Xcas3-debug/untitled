package Skillom;
import java.util.Random;
import lr1.Main;
import java.util.Scanner;
public class GPT {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей:");
    int n = scanner.nextInt();
    int[] ages = new int[n];
       System.out.println ("Введите возраст каждого человека:");
        for (int i = 0; i < n; i++) {
        ages[i] = scanner.nextInt();
        if (ages[i] < 0 || ages[i] > 120) {
            System.out.println("Неверный ввод. Возраст должен быть от 0 до 120.");
            return;
        }
    }
    sort(ages);
        System.out.println("Возраст людей по порядку возрастания:");
        for (int age : ages) {
        System.out.print(age + " ");
        if (age < 18) {
            System.out.println("- несовершеннолетний");
        } else if (age < 65) {
            System.out.println("- взрослый");
        } else {
            System.out.println("- пенсионер");
        }
    }
}

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

///*//////////*//////////////*///////////////////*////////////////////*////////*//////////

    }
}

