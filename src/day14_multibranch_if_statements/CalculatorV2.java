package day14_multibranch_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number");
        double num1 = scan.nextDouble();
        //System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        System.out.println("Choose operator");
        String operator = scan.next();

        if(operator.equals("+")){
            System.out.println(num1 + num2);
        }else if(operator.equals("-")){
            System.out.println(num1-num2);
        }else if(operator.equals("*")){
            System.out.println(num1*num2);
        }else if(operator.equals("%")){
            System.out.println(num1%num2);
        }else if(operator.equals("/")){
            System.out.println(num1/num2);
        }else{
            System.out.println("Invalid character");
        }
    }
}