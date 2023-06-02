package Skillom;

public class pr211 {
    public static void main(String[] args) {
        int milkAmount = 300; // ml кол молока
        int powderAmount = 500; // g
        int eggsCount = 4; // items количество яиц
        int sugarAmount = 1000; // g сахар
        int oilAmount = 300; // ml масла
        int appleCount = 8; // items
        //int flourAmount = 500;//g мука
        //int saltAmount = 5; //g соль
        // Example
        // apples - 5

        if (appleCount >= 5) {
            System.out.println("Apple juice");//Яблочный сок
        }
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("Pancakes");// блин
        }
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            // milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");
        }
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Apple pie");//ябллочный пирог
        }
    }
}

