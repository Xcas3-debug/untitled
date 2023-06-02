package Basket;



public class Main {
    public static void main(String[] args) {
        createBasket();

        Basket vasyBasket = new Basket();
        vasyBasket.add("Молоко", 60,2,1);
        // vasyBasket.add("Молоко", 60,1,1);
        vasyBasket.add("Хлеб",40,3,0.5);

        Basket sargayBasket = new Basket(100);
        sargayBasket.add("Мука", 70,1,1);
        sargayBasket.add("Сахар",40,2,0.5);

        Basket petyBasket = new Basket(570);
        petyBasket.add("Лопата",280,2, 2);
        petyBasket.add("Бочка",2900,2, 10);

        Basket mashaBasket = new Basket(" Cтол",5000);

        Basket katyaBasket = new Basket(500);  //items
        katyaBasket.add("Cтул", 200, 2,14);

        vasyBasket.print("Корзина Васи: ");
        System.out.println();
        sargayBasket.print("Корзина Сергей: ");
        System.out.println();
        petyBasket.print("Корзина Пети: ");
        System.out.println();
        mashaBasket.print("Корзина Маши: ");
        System.out.println();
        katyaBasket.print("Корзина Кати: ");

        System.out.println();
        System.out.println("Количество товаров всех корзин: " + Basket.getItemCountForAllBaskets());
        System.out.println("Общая стоимость товаров всех корзин: " + Basket.getCostForAllBaskets());


        Product product = new Product("молоко",56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);
/**/

   //     Basket basket = new Basket("Товары",478394);
Session session = new Session();
        System.out.println(Basket.getCount());//cтатич перемен  // getcount // static




    }
    public static void createBasket(){
        Basket basket = new Basket("Товары",478394);
    }



    //DelilveryOrder order = new DelilveryOrder(true,false,true);
    DelilveryOrder order = new DelilveryOrder(DeliveryType.PEDESTRIAN, Fragile.NO,Cold.YES);

}
