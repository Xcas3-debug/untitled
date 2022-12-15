package lr5;

public class lr5example15_04 {
    public static void main(String[] args) {

        Numbers Numbers1 = new Numbers(12, 'A');
        Numbers Numbers2 = new Numbers(65.1267);
    }

    static private class Numbers {

        private char charr;
        private int integer;


        Numbers(int i, char c) {
            this.charr = c;
            this.integer = i;
            int length = (int) (Math.log10(integer) + 1);
            double result = (double) charr + (double) integer * 1 / Math.pow(10, length);
            System.out.println("result = " + result + "; ch = " + (double) charr + "; int = " + length + "\n");
        }


        Numbers(double d) {

            char ch1 = (char) d;

            integer = (int) ((d - (int) d) * 100);
            System.out.println("char = " + ch1 + "; integer = " + integer + "\n");
        }
    }
}