package Skillom;

    public class propus {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;
        boolean isPersonal = true;
 //       String message;


//        if(passIsValid && !inCarantine){
//            message= "Проход Открыт";
//        } else {
//          message= "Проход закрыт";
//    } //TODO: тудо туду крментария

        /*
        втлдвмлт
         */
/**
 * javadock
 * defeerfrrg
 *
 */
        String message = passIsValid && !inCarantine ?
                "Проход открыт" :
                (isPersonal ? "Проход открыт только для персонала" : "Проход закрыт");
        System.out.println(message);


        if (passIsValid && !inCarantine) {
            message = "Проход открыт";

       } else if (isPersonal) {
            message = "Проход открыт только для персонала";
      } else {
               message = "Проход закрыт";
            }
        System.out.println(message);
        }
    }