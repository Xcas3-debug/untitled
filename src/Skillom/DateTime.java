package Skillom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime {
    public static void main(String[] args) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));

//        for( int i = 56; i > 0; i = i + 10 ) {
//            System.out.println("YES" + i);
//            if (i > 60) {
//                //System.out.println("YES" + i);
//                break;
//            }
//        }
//        int i = 0;
//        while ( i > 0 ) {
//            i = i + 1;
//            System.out.println("YESW");
//        }
//        System.out.println("YWEWno");
//
//        i = 0;
//        while (i < 20) {
//            if (i > 6 && i < 10){
//                //i= i+ 1;
//                continue;
//            }
//           // i = i + 1;
//            System.out.println("YESLL" + i);
//            i= i + 1;
//        }

        for(int i = 0; i<10; ) {
            if(i<5) {
                i=i+1;
            }
            i=i+1;
            System.out.println("YES5Z" + i);
        }


    }
}

