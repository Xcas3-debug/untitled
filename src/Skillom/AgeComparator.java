

package Skillom;
/* Принято: независимо от значений возрастов, которые указаны в первых трёх переменных
 (в пределах от 0 до 120), в консоль они должны выводиться в порядке увеличения — минимальный,
 средний и максимальный.*/
/** Создайте ещё три переменные типа int с именами min, middle и max, в которых в результате
 выполнения кода должны будут оказаться минимальный, средний и максимальный возрасты
 соответственно. Пусть изначально они будут равны значению −1, это позволит вам проверить,
 что переменная изменила своё значение в процессе выполнения программы, так как
 не может быть возраста меньше нуля:
 **/

import java.util.Random;
import java.util.Random;
import java.util.Scanner;
public class AgeComparator {
    public static void main(String[] args) {
//приоритеты лог операций: скобках,инверсия,коньюнц,дизюнц,строгая диз,эквивалентность.
        Random rnd = new Random(); // создаем объект Random
        int vasyaAge = -120 + rnd.nextInt(240 - (-120) + 1); // генерируем случайное число от 0 до 99
        int katyaAge = -120 + rnd.nextInt(240 - (-120) + 1);
        int mishaAge = -120 + rnd.nextInt(240 - (-120) + 1);
        System.out.println("Случайное число: " + vasyaAge); // выводим число на консоль
        System.out.println("Случайное число: " + katyaAge);
        System.out.println("Случайное число: " + mishaAge);
//        System.out.println("Введите возраст Васи: "); new Scanner(System.in).nextInt();

//        System.out.println("Введите возраст Кати: ");
        //int katyaAge = new Scanner(System.in).nextInt();
//        System.out.println("Введите возраст Миши: ");
        //int mishaAge = 36;//new Scanner(System.in).nextInt();

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст


        /**/
        boolean MinError2 = katyaAge <= vasyaAge && katyaAge <= mishaAge;
        boolean MinError = vasyaAge <= katyaAge && vasyaAge <= mishaAge;

        boolean MaxError = vasyaAge >= katyaAge && vasyaAge >= mishaAge;
        boolean MaxEror2 = katyaAge >= vasyaAge && katyaAge >= mishaAge;
        /**/
        boolean HasErorNegative = (vasyaAge < 0 || katyaAge < 0 || mishaAge < 0); // если будет true
        boolean Plus120Eror = (vasyaAge > 120 || katyaAge > 120 || mishaAge > 120);

        if (MinError) {
            min = vasyaAge;
    //*        HasErorNegative = true;

        }
        if (MinError2) {
            min = katyaAge;
    //*        HasErorNegative = true;
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
    //*        HasErorNegative = true;
        }

        /*vasyaAge <= mishaAge && vasyaAge >= katyaAge*/
        if (vasyaAge <= mishaAge && vasyaAge >= katyaAge) {
            middle = vasyaAge;
            //hasErorNegative = true;
        } else if (katyaAge <= vasyaAge && katyaAge >= mishaAge || katyaAge >= vasyaAge && katyaAge <= mishaAge) {
            middle = katyaAge;
            //hasErorNegative = true;

        } else if (mishaAge <= vasyaAge && mishaAge >= katyaAge || mishaAge >= vasyaAge && vasyaAge <= katyaAge) {
            middle = mishaAge;
            // hasErorNegative = true;
        }
        /**/
        if (MaxError) {
            max = vasyaAge;
            // hasErorNegative = true;
   //*         Plus120Eror = true;
        }
        if (MaxEror2) {
            max = katyaAge;
            // hasErorNegative = true;
    //*        Plus120Eror = true;

        } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
            // hasErorNegative = true;
    //*        Plus120Eror = true;
        }


        if (HasErorNegative ) {          // hasErorNegative== (vasyaAge <= 0 || katyaAge <= 0 || mishaAge <= 0)

            System.out.println("ОТРИЦАТЕЛЬНЫЙ ВОЗРАСТ!!! " + min + "   " + HasErorNegative);

        }

        if (Plus120Eror) {  //== (vasyaAge > 120 || katyaAge > 120 || mishaAge > 120)
            System.out.println("ВОЗРАСТ БОЛЬШЕ 120!!!         " + Plus120Eror);
   //*         Plus120Eror = true;
        } else {
            //Plus120Eror = false;
            System.out.println(" Возраст не превышает 120     " + Plus120Eror);

        }

        System.out.println("Minimal age: " + min + "      ");
        System.out.println("Middle age: " + middle + "        ");
        System.out.println("Maximal age: " + max + "        ");

        int a = 3;
        int b = 5;
        if (a < b && b * a > 15) {
            System.out.println("ELS");
        }
        System.out.println("TR");
        System.out.println(true || false && false);

//////*///////*/////////////*//////////////////*////////////*///////*///////////*////////*/
       // Random rnd = new Random(); // создаем объект Random
        int vasyaAge1 = -120 + rnd.nextInt(240 - (-120) + 1); // генерируем случайное число от 0 до 99
        int katyaAge2 = -120 + rnd.nextInt(240 - (-120) + 1);
        int mishaAge3 = -120 + rnd.nextInt(240 - (-120) + 1);
        System.out.println("Случайное число: " + vasyaAge1); // выводим число на консоль
        System.out.println("Случайное число: " + katyaAge2);
        System.out.println("Случайное число: " + mishaAge3);
//        int vasyaAge1 = 10;
//        int katyaAge2 = 30;
//        int mishaAge3 = 20;

        int middle1 = -1;
        int min1 = -1;
        int max1 = -1;

        boolean DO120 = vasyaAge1 > 120 || katyaAge2 > 120 || mishaAge3 > 120; // будет true
        boolean DONULL = vasyaAge1 < 0 || katyaAge2 < 0 || mishaAge3 < 0;

//        int vasyaAge1 = 50;
//        int katyaAge2 = 1;
//        int mishaAge3 = 0;

        if (vasyaAge1 >= mishaAge3) { // M > V
            max1 = vasyaAge1;   /// пп
            min1 = mishaAge3;  //    пп
        } else {
            max1 = mishaAge3;   //m>v  **
            //DO120 = false;
            min1 = vasyaAge1;   //v<m   пп
        }
        if (katyaAge2 >= max1) {  // k >m      >mishaAge3
            middle1 = max1;  //m

            max1 = katyaAge2;  //k         пп

        } else if (katyaAge2 <= min1) {  //k>v
            middle1 = min1;    //
          /* DO120 = true;  */
            min1 = katyaAge2; //печать
        } else {
            middle1 = katyaAge2;  //
            //DONULL = true;
        }

        if (DO120) {  // !true = false
            System.out.println("ВОЗРАСТ БОЛЬШЕ 120!!!         " + DO120);  //true
        } else {
            System.out.println("МЕНЬШЕ<<<< В 120!!!         " + DO120);  //false
        }

        if (DONULL) {
            System.out.println("ВОЗРАСТ МЕНЬШЕ НУЛЯ    " + DONULL);  //true

        }


        System.out.println("Minimal Age: " + min1);
        System.out.println("Middle Age: " + middle1);
        System.out.println("Maximal Age: " + max1);
///*//////////*//////////////*///////////////////*////////////////////*////////*//////////

    }


}






