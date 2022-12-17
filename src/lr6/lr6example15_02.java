package lr6;
import java.util.Scanner;

public class lr6example15_02 {

    public static void main(String[] args) {
        Klass Too = new Klass();
        for (int i = 0; i<25; i++){
            System.out.println(Too.getKlass());
        }
    }
    static class Klass{
        private static int num = 0;
        static int getKlass(){
            num++;
            System.out.print("число = ");
            return num;
        }
    }
}