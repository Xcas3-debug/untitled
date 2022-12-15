package lr5;
import java.util.Scanner;

public class lr5example15_05 {
    public static void main(String[] args) {
        Exemple exe = new Exemple(11);
        exe.getNum(11);
        System.out.println("число = " + exe.PrintInt());
        exe.getNum();
        System.out.println("число = " + exe.PrintInt());
    }
}
class Exemple{
    private int num;

    public int getNum(int num1){
        this.num = num1;

        if (num < 100){
            return num;
        }else {
            num = 100;
        }

        return num;
    }
    public void getNum() {
        System.out.println(" метод без аргументов");
    }

    public int PrintInt(){
        return num;
    }

    Exemple (int num){
        System.out.println("конструктор Exemple() = значению " + num );
        this.getNum(num);
    }
}

