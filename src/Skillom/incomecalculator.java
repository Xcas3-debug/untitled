package Skillom;
import java.util.Scanner;
public class incomecalculator {
// параметры программы
    private static int minIncome = 200000;// мин доход
    private static int maxIncome = 900000;// макс доход
    private static int officeRentCharge = 140000;// стоим аренд
    private static int telephonyCharge = 12000;//стоим телеф
    private static int internetAccessCharge = 7200;// стоим доступа
    private static int assistantSalary = 45000;//зп ассист
    private static int financeManagerSalary = 90000;// зп фин манендж
    private static double mainTaxPercent = 0.24;//% основн налога
    private static double managerPercent = 0.15;//% манендж
    private static double minInvestmentsAmount = 100000;//мин сум инвест
    public static void main(String[] args) {  //методы   //main(String[] args) - сингантура метода
        while (true) {
            System.out.println("Введите сумма дохода компании за " +
                    "месяц" + "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();

            if(!checkIncomeRange(income)) {
                continue;
            }
            double managerSalary = income * managerPercent;
            double pureIncome = income - managerSalary -
                    calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;
            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                    (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ? "Да": "нет"));
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно " +
                        "зарабатывать!");
            }
        }
    }
    private  static  boolean checkIncomeRange(int income) //
        {
            if (income < minIncome) {
                System.out.println("Доход меньше нижней границы");
                return false;
            }
            if (income > maxIncome) {
                System.out.println("Доход выше верхней границы");
                return false;
            }
            return true;
        }
    private static int calculateFixedCharges() //расходы
        {
            return officeRentCharge +
                    telephonyCharge +
                    internetAccessCharge +
                    assistantSalary +
                    financeManagerSalary;
        }
    }
