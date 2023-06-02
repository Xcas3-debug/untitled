package Skillom;

public class brCon {
    public static void main(String[] args) {
        int soughtYear = 1985;

        int firstYear = 1922;
        int lastYear = 2022;
            boolean yearExist = false;
        for (int year = firstYear; year <= lastYear; year= year + 1) {
            System.out.println(year);
            if (year == soughtYear) {

                yearExist = true;
               break; // после этой команды код не выполняется
            }
        }
            String found = "Год найден!";
            String notFound = "Год не найден!";
            System.out.println(yearExist ? found : notFound);


        int soughtYear1 = 1985;

        int firstYear1 = 1922;
        int lastYea1 = 2022;

//        for (int year1 = firstYear1; year1 <= lastYear; year1 = year1 + 1) {
//
//            if (year1 % 4 == 0) {
//               System.out.println(year1);
//                for (int month = 1; month <= 12; month = month +1) {
//   String zero = month < 10 ? "0" : "";
////String zero;
////                    if (month < 10) {
////                        zero = "0";
////                    } else {
////                        zero = "";
////                    }
//                    System.out.println("29."+ zero + month+ "."+ year1);
//                }
//            }
//        }

        for (int year1 = firstYear1; year1 <= lastYear; year1 = year1 + 1) {

            if (year1 % 4 != 0) {
                continue; // прервать текущюю интерацию и перейт к след
            }
            System.out.println(year1);
            for (int month = 1; month <= 12; month = month +1) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29."+ zero + month+ "."+ year1);
        }

            }





    }
}
