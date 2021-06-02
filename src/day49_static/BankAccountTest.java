package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount();
        user1.user = "husband";
        user1.showBalance();
        user1.spend(100.0);
        user1.showBalance();

        BankAccount user2 = new BankAccount();
        user2.user = "wife";
        user2.showBalance();
        user2.spend(175.0);
        user2.showBalance();
    }
}
