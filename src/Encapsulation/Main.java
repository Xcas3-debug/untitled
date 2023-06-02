package Encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Dimensions dimensions = new Dimensions(1,2,3);
                dimensions = dimensions.setLength(1900);
                dimensions = dimensions.setWidth(1900);
                dimensions = dimensions.setHeight(1900);
                StorageOfCargoInformation cargoInformation = new StorageOfCargoInformation(50,
                        "Проспект", dimensions, "Ф100",
                        true, true, 1,1,1);
                cargoInformation = cargoInformation.setWeight(111);
                System.out.println(cargoInformation);

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }


            }
        }

