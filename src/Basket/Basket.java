package Basket;

import java.time.Period;

public class Basket {

        private static int basketCount = 0;
        private String items = ""; //складыв доб товары

        private int totalPrice = 0;//итог цена
        private double totalWeight = 0;// общий вес
        private int limit;
        private static int totalCost = 0;


        //public static int count = 0;
        private static  int count = 0;
        private static class AllBaskets {
            static int itemCount;//кол товаров
            static int cost;//стоим
        }
private static int timeout;
//     private static int getTimeout() {
//            int secondInHour = 3600;
//            int hourseInDay = 24;
//            int daysInWeek = 7;
//            int daysInMonth = 38;
//            timeout = secondInHour * hourseInDay *
//                    (Period.type == PeriodType.WEEK ? daysInWeek : daysInMonth);
//        }

        public Basket(){  // 1конструкт без параметр

           count = count + 1;//increaseCount(1);
           // basketCount = basketCount + 1;
            items = "Список товаров";
            this.limit = 1000000;
        }
        public Basket(int limit){  // // конструкт2 с параметр

            this();// вызыв конструктор без параметр
            this.limit = limit; // this назн как переменая класса,  2 перемен: перемен переданная в параметре в конструктора и перемен класса

        }
        public Basket(String items, int totalPrice) { //3конструкт   инилизир корзину из заранее сохран списка товара и общей цены
            this();
            this.items = this.items + items;
            this.totalPrice = totalPrice;
            /*/*/
            this.totalPrice = this.totalPrice + totalPrice;
            this.totalWeight = this.totalWeight + totalWeight;/*при обращен премен обекту*/
        }

        public static int getCount() {  //static
            return count;
        }
        public void increaseCount(int count) {//st
            Basket.count = Basket.count + count;
        }

        public void add(String name, int price) {  //метод1 добавлять товары  //static    убрали везде
//
            add(name, price, count);
        }// перезагрузка метода

        public void add(String name, int price, int count){
            boolean error = false;
            if (contains(name)) {  //есть ли в корзине этот товар котор пытаемся доб
                error = true;
            }
            if(totalPrice + count * price >= limit){
                error = true;
            }

            if (error) {
                System.out.println("Error occured :(");
                return;
            }

            items = items + "\n" + name + " - " + count
                    + " шт. - " + price + " Руб. " ;
            totalPrice = totalPrice + count * price;
            /*/*/
            AllBaskets.itemCount += count;/**/
            AllBaskets.cost += price * count;//
        }


        public void add(String name, int price, double weight)
        {

            add(name, price,count, weight);
            totalWeight += weight;////*/
        }

        public void add(String name, int price, int count, double weight)
        {
            add(name, price,count);

            totalWeight += count * weight;//totalWeight = totalWeight + count * weight;
        }

        /*/*/
        public void clear() { //метод2 void нет возращ значения   // очищ корзину
            items = "";
            totalPrice = 0;
            totalWeight = 0;
        }
        public int getTotalPrice(){  // получ  общ стоимость товара
            return totalPrice;
        }

        public static int getTotalCost() {
            return totalCost;
        }
        public static int getTotalCount() {
            return basketCount;
        }
        public double getTotalWeight() {
            return totalWeight;
        }
        public static int getItemCountForAllBaskets() {
            return AllBaskets.itemCount;
        }
        public static int getCostForAllBaskets() {
            return AllBaskets.cost;
        }

        /*/*/
        public boolean contains(String name){   //метод3 проверять сущ ли в этой корзине товар
            return items.contains(name);

        }

        public void print(String title) {  //метод4 вывод содерж
            System.out.println(title);
            if (items.isEmpty()) {    //метод строки isEmply проверяет пустая ли строка
                System.out.println("Корзина пуста");

            } else {
                System.out.println(items);
                System.out.println("Общая стоимость товаров в корзине: " + totalPrice + " рублей");
                System.out.println("Общий вес товаров в корзине: " + totalWeight + " кг");

            }

        }

    }
///////////////*///////////////*//////////

