package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretPinCode = 1234;
        int pinCode;
        int trials = 0;

        do {
            System.out.println("enter your PIN code");
            pinCode = scan.nextInt();
            trials++;
            if (trials == 4) {
                System.out.println("Exceed number of wrong pin! Bye");
            }
        } while(pinCode!=secretPinCode && trials <4);
        System.out.println("Welcome to your account");


    }
}
