//package AaA;
//
//public class Computer {
//
//    public  String vendor;
//    public  String name;
//    public  Processor processor;
//    public  OperationMemory operationMemory;
//    public  StorageMemory storageMemory;
//    public  Screen screen;
//    public  Keyboard keyboard;
//    public  double totalWeight;
//
//    public Computer () {
//    }
//
//    public Computer (String vendor, String name){
//        this.vendor = vendor;
//        this.name = name;
//    }
//
//    public Computer (String vendor, String name, double totalWeight) {
//        this.vendor = vendor;
//        this.name = name;
//
//    }
//    public Computer (String vendor,
//                     String name,
//                     Processor processor,
//                     OperationMemory operationMemory,
//                     StorageMemory storageMemory,
//                     Screen screen,
//                     Keyboard keyboard,
//                     double totalWeight) {
//        this.vendor = vendor;
//        this.name = name;
//        this.processor = processor;
//        this.operationMemory = operationMemory;
//        this.storageMemory = storageMemory;
//        this.screen = screen;
//        this.keyboard = keyboard;
//        this.totalWeight = totalWeight;
//    }
//    public void setVendor (String vendor) {
//        this.vendor = vendor;
//    }
//    public void setName (String name) {
//        this.name = name;
//    }
//    public String getVendor() {return vendor;}
//    public String getName() {return name;}
//
//    public double getTotalWeight() {
//        return processor.getWeight()+ operationMemory.getWeight()+ storageMemory.getWeight() +
//                screen.getWeight() + keyboard.getWeight();
//    }
//    public String toString() {
//        return "Данные о компьютере:" + "\n" + "\n" +
//                "Страна производитель: " + getName() + "\n" +
//                "Поставщик: " + getVendor() + "\n" +
//                processor.toString() + operationMemory.toString() + storageMemory.toString() +
//                screen.toString() +keyboard.toString() + "Общий вес омпьютера: " +getTotalWeight() + "гр."  + "\n" ;
//        public Processor getProcessor(){ return processor;}
//        public OperationMemory getOperationMemory(){ return operationMemory;}
//        public StorageMemory getStorageMemory(){ return storageMemory;}
//        public Screen getScreen(){ return screen;}
//        public Keyboard getKeyboard(){ return keyboard;}
//
//        public void setProcessor(Processor processor) { this.processor = processor;}
//        public void setOperationMemory(OperationMemory operationMemory) { this.operationMemory = operationMemory;}
//        public void setStorageMemory(StorageMemory storageMemory) { this.storageMemory=storageMemory;}
//        public void setScreen(Screen screen) {this.screen=screen;}
//        public void setKeyboard(Keyboard keyboard) {this.keyboard=keyboard;}
//    }
//}