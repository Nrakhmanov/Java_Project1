package day14_multibranch_if_statements;
import java.util.Scanner;
public class CalculatorV3_with_Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number");
        double num1 = scan.nextDouble();
        //System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        System.out.println("Choose operator: +, -, *, /, %");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '%') {
            System.out.println(num1 % num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid character");
        }
    }
}