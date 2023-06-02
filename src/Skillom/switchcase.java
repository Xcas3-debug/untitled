package Skillom;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
//         while (true){
//             System.out.println("Введите новое сообщение");
//             String input = new Scanner(System.in).nextLine();
//             if(input.equals("Привет")){
//                 System.out.println("Привет");
//             } else if (input.equals("Как дела?")) {
//                 System.out.println("Отлично! У тебя как?");
//             }
//                 else {
//                     System.out.println("Не понимаю сообщение");
//                 }
//             }

        switch (input) {
            case "Привет!":
                System.out.println("КУ");
                break;
            case "Как дела?":
                System.out.println("Отлично! У тебя как?");
                break;
            default:
                System.out.println("Не понимаю сообщение");
        }
    }
}


//    witch (input) {
//        case "Привет!" -> System.out.println("КУ");
//        case "Как дела?": ->System.out.println("Отлично! У тебя как?");
//        default -> System.out.println("Не понимаю сообщение");
//    }
