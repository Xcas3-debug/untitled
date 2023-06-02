package Skillom;

public class korzina {
    public static void main(String[] args) {
        Basket vasyBasket = new Basket();
        vasyBasket.add("Молоко", 80,2);
        //vasyBasket.add("Молоко", 80);
        vasyBasket.add("Хлеб",40,2);

        Basket petyBasket = new Basket(500);
        petyBasket.add("Лопата",280);
        petyBasket.add("Бочка",2900,2);

        Basket mashaBasket = new Basket(" Cтол",5000);

        vasyBasket.print("Корзина Васи: ");
        petyBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");

        System.out.println();


        Product product = new Product("молоко",56);
            Order order = new Order();
            order.addProduct(product);
            System.out.println(product);


      //  int totalPrice = getTotalPrice();

      // System.out.println(getTotalPrice());


//        add("Колбасса", 76);
//        add("Молоко",55);
//        add("Масло", 120);
//        print("Содержание корзины:");

//System.out.println("Общая стимость товара: " + totalPrice);
//System.out.println(getTotalPrice());
//        clear();
//        System.out.println();
//        print("Содержание корзины:");
//        System.out.println(getTotalPrice());
//        System.out.println("Общая стимость товара: " +
//                totalPrice);
    }


}
