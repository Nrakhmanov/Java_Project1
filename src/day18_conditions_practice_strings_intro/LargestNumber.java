package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers" );

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if(num1>num2 && num1 > num3){
            System.out.println("Largest numbers is " + num1);
        }else if (num2 >num1 && num2 >num3){
            System.out.println("Largest numbers is " + num2);
        }else if(num3>num1 && num3>num2) {
            System.out.println("Largest numbers is " + num3);
        }else
            System.out.println("All numbers are equal-10");
    }
}
