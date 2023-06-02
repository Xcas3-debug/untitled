package Skillom;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class main {
    public static void main(String[] args) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));


//        public static void main(String[] args) {
//            add("Колбасса", 76);
//            add("Молоко",55);
//            add("Масло", 120);
//            print("Содержание корзины:");
//            int totalPrice = getTotalPrice();
//            System.out.println("Общая стимость товара: " +
//                    totalPrice);
//            //System.out.println(getTotalPrice());
//            clear();
//            System.out.println();
//            print("Содержание корзины:");
//            System.out.println(getTotalPrice());
//            System.out.println("Общая стимость товара: " +
//                    totalPrice);
//        }









    }
}
