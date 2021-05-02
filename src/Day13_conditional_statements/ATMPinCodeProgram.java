package Day13_conditional_statements;
import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****WELCOME TO TCF BANK***");
        System.out.println("Please enter your PIN");

        int inputPinCode = scan.nextInt();
        int secretPinCode = 2222;

        if(inputPinCode == secretPinCode){
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("incorrect pincode!");
            System.out.println("Please try again");
        }
        System.out.println("Thank you for using TCF Bank");
    }
}
