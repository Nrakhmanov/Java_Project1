package Day13_conditional_statements;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter sales amount");
        double salesAmount = scan.nextDouble();
        double bonus = 0.0;

        if (salesAmount == 1000) {
            System.out.println("Good job, you qualified for bonus");
            bonus += 50;
            System.out.println("Your bonus is: " + bonus);
        }

        if (salesAmount > 1000) {
            System.out.println("You are qualified for full bonus");
            bonus += 100;
            System.out.println("Your bonus is: " + bonus);
        }
        if (salesAmount < 1000) {
            System.out.println("No bonus for you lazy butt");
        }

    }

}