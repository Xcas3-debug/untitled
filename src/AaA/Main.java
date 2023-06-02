//package AaA;
//public class Main {
//    public static void main(String[] args) {
//
//        Processor processor_1 = new Processor(3.5, 4, "Intel", 9.15);
//        OperationMemory operationMemory_1 = new OperationMemory("DDR3", 8192, 18.0);
//        StorageMemory storageMemory_1 = new StorageMemory("StorageMemoryType", 500);
//        Screen screen_1 = new Screen("24", 5);
//        Keyboard keyboard_1 = new Keyboard("Механическая", true, 2500);
//
//        Computer computer_1 = new Computer("Intel", "China");
//        computer_1.setProcessor(processor_1);
//        computer_1.setOperationMemory(operationMemory_1);
//        computer_1.setStorageMemory(storageMemory_1);
//        computer_1.setScreen(screen_1);
//        computer_1.setKeyboard(keyboard_1);
//
//        System.out.println(computer_1.toString());
//
//    }
//
//    public class OperationMemory {
//
//        public String typeOM;
//        public int volume;
//        public double weight;
//
//        public OperationMemory(String typeOM, int volume, double weight) {
//            this.typeOM = typeOM;
//            this.volume = volume;
//            this.weight = weight;
//        }
//
//        public OperationMemory setTypeOM(String typeOM) {
//            return new OperationMemory(typeOM, volume, weight);
//        }
//
//        public OperationMemory setVolume(int volume) {
//            return new OperationMemory(typeOM, volume, weight);
//        }
//
//        public OperationMemory setWeight(double weight) {
//            return new OperationMemory(typeOM, volume, weight);
//        }
//
//        public String getTypeOM() {
//            return typeOM;
//        }
//
//        public int getVolume() {
//            return volume;
//        }
//
//        public double getWeight() {
//            return weight;
//        }
//    }
//
//    public class Processor {
//        public double frequency;
//        public int amountCore;
//        public String brand;
//        public double weight;
//
//
//        Processor(double frequency, int amountCore, String brand, double weight) {
//            this.frequency = frequency;
//            this.amountCore = amountCore;
//            this.brand = brand;
//            this.weight = weight;
//        }
//
//        public double getFrequency() {
//            return frequency;
//        }
//
//        public int getAmountCore() {
//            return amountCore;
//        }
//
//        public String getBrand() {
//            return brand;
//        }
//
//        public double getWeight() {
//            return weight;
//        }
//
//        void setFrequency(double frequency) {
//            this.frequency = frequency;
//        }
//
//        public void setAmountCore(int amountCore) {
//            this.amountCore = amountCore;
//        }
//
//        public void setBrand(String brand) {
//            this.brand = brand;
//        }
//
//        public void setWeight(double weight) {
//            this.weight = weight;
//        }
//    }
