package ObjectsAndMethods1;

public class Arithmetic {
    int num1;
    int num2;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public int max() {
        return num1 > num2 ? num1 : num2;
    }

    public int min() {
        return num1 < num2 ? num1 : num2;
    }

}