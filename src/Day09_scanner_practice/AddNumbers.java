package Day09_scanner_practice;

import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = input1.nextInt();
        System.out.println("Please enter second number");
        int num2 = input2.nextInt();
        int num3 = num1+num2;
        System.out.println(num3);


    }
}
