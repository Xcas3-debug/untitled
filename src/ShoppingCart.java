public class ShoppingCart {
        private int totalItems;
        private double totalPrice;
        private double totalWeight;

        public ShoppingCart() {
            this.totalItems = 0;
            this.totalPrice = 0.0;
            this.totalWeight = 0.0;
        }

        public void add(String name, int price, int count) {
            totalItems += count;
            totalPrice += price * count;
        }

        public void add(String name, int price, int count, double weight) {
            add(name, price, count);
            totalWeight += weight * count;
        }

        public int getTotalItems() {
            return totalItems;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public double getTotalWeight() {
            return totalWeight;
        }
    }
