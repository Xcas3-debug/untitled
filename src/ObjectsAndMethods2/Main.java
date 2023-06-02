package ObjectsAndMethods2;

public class Main {
        public static void main(String[] args) {
            Basket vasyBasket = new Basket();
            vasyBasket.add("Молоко", 60,2,1);
          // vasyBasket.add("Молоко", 60,1,1);
            vasyBasket.add("Хлеб",40,3,0.5);

            Basket petyBasket = new Basket(570);
            petyBasket.add("Лопата",280,2, 2);
            petyBasket.add("Бочка",2900,2, 10);

            Basket mashaBasket = new Basket(" Cтол",5000);

            Basket katyaBasket = new Basket("", 500);
            katyaBasket.add("Cтул", 200, 2,14);

            vasyBasket.print("Корзина Васи: ");
            System.out.println();
            petyBasket.print("Корзина Пети: ");
            System.out.println();
            mashaBasket.print("Корзина Маши: ");
            System.out.println();
            katyaBasket.print("Корзина Кати: ");

            System.out.println();
            System.out.println("Количество товаров всех корзин: " + Basket.getItemCountForAllBaskets());
            System.out.println("Общая стоимость товаров всех корзин: " + Basket.getCostForAllBaskets());


        }

}

