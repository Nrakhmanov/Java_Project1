package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();

        account.setAccountHolder("Satoshi Nakamoto");
        account.setAccountNumber(123456789);
        account.setBalance(1000000);

        System.out.println(account);





    }
}
