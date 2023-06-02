package Bank;

public class Main {
    public static void main(String[] args) {

    BankDetails details = new BankDetails();
    details.setBillNumber("40702810500120002155");
    Company company = new Company("Смарт-Экспресс", details);
//some code
    details.setBillNumber("30502810500120002155");
    System.out.println(company);

    BankDetails copy = new BankDetails(
            details.getBillNumber(),
            details.getCorrespondenceBill(),
            details.getBikNumber(),
            details.getBankName(),
            details.getCity()
    );

    }
}


