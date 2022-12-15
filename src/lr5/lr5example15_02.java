package lr5;
import java.util.Scanner;

public class lr5example15_02 {
    public static void main(String[] args) {
        Chars ch = new Chars();
        ch.getCh1_Ch2();
    }
}
class Chars {
    char ch1 = 'A';
    char ch2 = 'D';
    int b = ch2;
    public void getCh1_Ch2() {
        int res = 0;
        for (int i = ch1;i<=b;i++){
            res = i;
            System.out.println((char)res);
        }
    }
}