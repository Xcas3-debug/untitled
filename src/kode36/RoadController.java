package kode36;
import java.util.Calendar;
import java.util.Scanner;
public class RoadController {
    private static  double passengerCarMaxWeight = 3500;//kg — максимальный вес ЛЕГКОВОГО автомобиля;
    private static int passengerCarMaxHeight = 2000; //mm — максимальная высота ЛЕГКОВОГО автомобиля;
    private static int controllerMaxHeight = 4000; //mm — максимальная высота контроллера пропускного пункта;

    private static int passengerCarPrice = 100;// Rub — стоимость проезда ЛЕГКОВОГО автомобиля;
    private static int cargoCarPrice = 250;// Rub — стоимость проезда грузового автомобиля;
    private static int vehiclePLUSPrice = 200;// Rub — дополнительная стоимость за проезд с прицепом.

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенироровать?");

        int carsCount = new Scanner(System.in).nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем авто спецтранспорта бесплатно
            if (car.isSpecial) {
                System.out.println("Шлакбаум открываетс ... Попутной пути!");
                continue;
            }

            //проверяем высоту и маассу авто, вычисл стоим проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате:" + price + "руб.");
        }
    }
    /**
     * Расчёт стоимости исходя из массы и высоты
     *
     **/
    private static int calculatePrice (Car car) {
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            System.out.println("Проезд невозможен высота вашего " +
                    "ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            double weight = car.weight;
//Грузовой автомобиль
            if (weight > passengerCarMaxWeight) {
                price = passengerCarPrice;

                if (car.hasVehicle) {
                    price = price + vehiclePLUSPrice;
                }
            }
// Легковой автомобиль
            else {
                price = cargoCarPrice;
            }
        } else {
            price = passengerCarPrice;
        }
        return price;

    }
}