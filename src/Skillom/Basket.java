package Skillom;  // конструкты это такие же как методы но только имя совпадает имени класса и вызыв при создан новых обектов с помощю ключ слово new

public class Basket {
     static int count = 0;
     String items = ""; //складыв доб товары

     int totalPrice = 0;//   итог цена
     int limit;


    public Basket(){  // 1конструкт без параметр
        increaseCount(1);
        items = "Список товаров";
        this.limit = 1000000;
    }
    public Basket(int limit){  // // конструкт2 с параметр
       // items = "Список товаров";
       this();// вызыв конструктор без параметр
    //limit = totalPriceLimit;
        this.limit = limit; // this назн как переменая класса,  2 перемен: перемен переданная в параметре в конструктора и перемен класса

    }
    public Basket(String items, int totalPrice) { //3конструкт   инилизир корзину из заранее сохран списка товара и общей цены
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;

    }

    public static int getCount() {
        return count;
    }
    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {  //метод1 добавлять товары  //static    убрали везде
//        if (contains(name)) {  //есть ли в корзине этот товар котор пытаемся доб
//            return;
//        }
//        if(totalPrice + price >= limit){
//            return;
//        }
//        items = items + "\n" + name + " - " +
//                cout +  ""price;
//        totalPrice = totalPrice  * price;  //
        add(name, price, 1);
    }// перезагрузка метода

    public void add(String name, int price, int count){

      boolean error = false;
        if (contains(name)) {  //есть ли в корзине этот товар котор пытаемся доб

            //return;
           error = true;
        }
        if(totalPrice + count * price >= limit){
            //return;
           error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " + count
                 + " шт. - " + price;
        totalPrice = totalPrice + count * price;  //
    }

    public void clear() { //метод2 void нет возращ значения   // очищ корзину
        items = "";
       totalPrice = 0;
        //totalPrice = price;
    }
    public int getTotalPrice(){  // получ  общ стоимость товара
        return totalPrice;
    }

    public boolean contains(String name){   //метод3 проверять сущ ли в этой корзине товар
      return items.contains(name);

//        if(items.contains(name)){
//            return true;
//        }
//        return false;
 }

    public void print(String title) {  //метод4 вывод содерж
        System.out.println(title);
        if (items.isEmpty()) {    //метод строки isEmply проверяет пустая ли строка
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }


    }

}


///////////////*///////////////*//////////








