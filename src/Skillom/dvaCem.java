package Skillom;
//2.7 тернарный оператор
public class dvaCem {
    public static void main(String[] args) {

        boolean errors = true;

        String message = errors ? "Печать разрешена" : "Печать запрещена";
        System.out.println(message);
 //       if (!errors) {
 //           System.out.println("Печать разрешена");
 //       } else {
//            System.out.println("Печать запрещена");
//        }
    }
}
