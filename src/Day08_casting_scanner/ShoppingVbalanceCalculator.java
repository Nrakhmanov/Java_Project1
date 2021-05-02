package Day08_casting_scanner;

public class ShoppingVbalanceCalculator {
    public static void main(String[] args) {
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.00;

        double total = price1+price2+price3;

        double initialBalance = 345.55;

        double remainingBalance = initialBalance-total;

        System.out.println("Your remaining balance is $" + remainingBalance);

        int balanceWithNoCents = (int) remainingBalance;

        System.out.println(balanceWithNoCents);



    }
}
