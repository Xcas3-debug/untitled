package lr5;
import java.util.Scanner;

public class lr5example15_06 {
    public static void main(String[] args) {
        Numbers num = new Numbers(10,50);
        num.PrintInt();
        num.getNum(9, 20);
        num.PrintInt();
        num.getNum(4);
        num.PrintInt();
    }
}
class Numbers {
    int numMax;
    int numMin;
    public void getNum(int num1, int num2){
        if (num1 > num2){
            this.numMax = num1;
            this.numMin = num2;
        }else {
            this.numMax = num2;
            this.numMin = num1;
        }
    }
    public void getNum (int num){
        this.numMax = num;
        this.numMin = 0;
    }
    Numbers(int num1, int num2){
        this.getNum(num1,num2);
    }
    public void PrintInt(){
        System.out.println("максимально значение: " + this.numMax + " " + "минимальное значение: " + this.numMin);
    }
}