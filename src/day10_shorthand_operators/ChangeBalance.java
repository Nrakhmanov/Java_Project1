package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200.44;
        System.out.println("balance = " + balance);
        double baklava = 22.50;
        balance = balance - baklava;
        System.out.println("balance = " + balance);
    }
}
