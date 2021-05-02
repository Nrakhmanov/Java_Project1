package Day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter hourly rate");
        double hourlyPay = input.nextDouble();
        double weeklyPay = hourlyPay*40;
        System.out.println("Weekle rate is " + weeklyPay);
        double monthlyPay = weeklyPay*4;
        System.out.println("Monthly rate is " + monthlyPay);
        double annualPay = weeklyPay*50;
        System.out.println("Annual rate is " + annualPay);

    }
}
