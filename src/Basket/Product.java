package Basket;

    public class Product {
        private final String name;
        private final int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public int getPrice() {
            return price;
        }

        /// в них созд копия исходн обекта
        public Product setName(String name) {
            return new Product(name, price);
        }

        public Product setPrice(int price) {
            return new Product(name, price);
        }
        //    public void setName(String name) {  /// final
//        this.name = name;
//    }
//    public void setPrice(int price) {
//        this.price = price;
//    }
///////////////



        public String toString(){
            return name + " - " + price;
        }

        public  void print(){//     не эфективн использован памяти// чтобы очищать память от таких объектов, на которыебольше нет ссылок, в виртуальной машине Java (JVM) есть
//            специальный механизм. Называется он garbage collector
//            («сборщик мусора»).
            String info = name + " - " + price;
            System.out.println(info);

        }
    }

