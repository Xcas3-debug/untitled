package ObjectsAndClasses_StaticFinal;

public class main {


    public static void main(String[] args) {
       Computer computerVasya = new Computer();
        MemoryRam memory1 = new MemoryRam();

        memory1.setMemoryRam("DDR3",1600,20);
        System.out.println("Оперативная память: " +
                "Тип памяти: " + memory1.type + " "+ "Частота: "+
                memory1.volume + " Вес: " + memory1.weight + " Грамм" );

        System.out.println(memory1.getWeight());

       // Computer computerVasya = new Computer();
        //System.out.println(computerVasya);

        CPU cpu = new CPU(3.2,4,40,"AMD");
        System.out.println("Оперативная память: " +
                "Частота: " + cpu.frequency+ " "+ "Частота: "+
                memory1.volume + " Вес: " + cpu.weight + " Грамм" );

        System.out.println(Computer.getTotalWeight());

    }
}





//        MemoryRam memory = new MemoryRam( "DDR4", 3488, 38);
//
//        Processor processor = new Processor ( frequency: 3.2, numberCores: 4, manufacturer: "Gigabyte", weight: 30); Disk disk = new Disk(TypeMemory.SSD, volume 2000, weight: 30); Keyboard keyboard = new Keyboard(type: "Razer", light: true, weight: 88);
//
//        Monitor monitor = new Monitor ( diagonal: 27.8, TypeMonitor.IPS, weight 2000);
//
//        Computer computerVasya = new Computer( name: "Monstr", vendor "Gigabyte", processor, memory, disk, monitor, keyboard);
//
//        System.out.println(computerVasya);
//
//        System.out.println("Общий вес всех составляющих + computerVasya.getAllWeight() + гp.");
//
//        System.out.println();
//
//        System.out.println(".
//
//                System.out.println();
//
//        Processor processor2 = new Processor( frequency 3.8, numberCores 8, manufacturer "Gigabyte", weight: 30); Memory memory2 = new Memory (type: "DDR5", volume: 4288, weight: 60); Disk disk2= new Disk(TypeMemory.SSD, volume: 2008, weight: 40); Monitor monitor2 = new Monitor ( diagonal 27.0, TypeMonitor.IPS, weight 2000);
//
//        Keyboard keyboard2 = new Keyboard(type: "Bloody", light true, weight: 60);
//
//        Computer computerPetya = new Computer ( name "Shark", vendor "Gigabyte", processor2, memory2, disk2, monitor2, keyboard2);
//
//        System.out.println(computerPetya);
//
//        System.out.println("Общий вес всех составляющих
//
//                computerPetya.getAllWeight() + rp.");
//
//

//    }

