package Skillom;

public class CoffeMashine {
    public static void main(String[] args) {
        int cofeeAmount = 2230;
        int milkAmount = 10;
        int skimmedMilkAmount = 120;
        int LowtosemMilkAmount = 1000;

        Boolean isBlocked = false;

        int cappucionMilkRequired = 60;
        int cappucionCofeeRequired = 15;
        boolean coffeIsEnough = cofeeAmount >= cappucionCofeeRequired;
        boolean hasErrors = false;

        if (!isBlocked && coffeIsEnough &&
                (skimmedMilkAmount >= cappucionMilkRequired ||
                        milkAmount >= cappucionMilkRequired)) {
            System.out.println("Готовим капутчимо");
        } else {
            System.out.println("Кофе машина заблокирована");
        }

        if (isBlocked) {
            System.out.println("Кофе машина заблокирована");
          hasErrors = true;
        }
        if (!coffeIsEnough) {
            System.out.println("Кофе недостаточно");
           hasErrors = true;
        }
        if (!(skimmedMilkAmount >= cappucionMilkRequired ||
                milkAmount >= cappucionMilkRequired)) {
            System.out.println("Молока не достаточно");
            hasErrors = true;
        }
        if (!hasErrors) {
            System.out.println("Готовим кофе");
            hasErrors = true;
        }
    }
}
