package lr5;

public class lr5example15_01 {
    public static void main(String[] args) {
        exemplar exe = new exemplar();
        exe.getCh('t');
        System.out.println(exe.showChar('x'));
        exe.ch3();
    }
}
class exemplar {
    private char ch1;
    private char ch2;

    //    1) Один из методов позволяет присвоить значение полю.
    public void getCh(char ch) {
        this.ch1 = ch;
    }

    //    2)Еще один метод при вызове возвращает результатом код символа.
    public int showChar(char ch) {
        this.ch2 = ch;
        return ch2;
    }

    //3) Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
    public void ch3() {
        System.out.println(ch2);
        System.out.println((int) ch2);
    }
}