package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 1122;
        int pinCode = 3333;

        int expLast4SSN = 2222;
        int expPinCode = 4444;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("authentication unsuccessful");
            if (last4SSN != expLast4SSN){
                System.out.println("Wrong SSN Number");}
            if (pinCode != expPinCode){
                System.out.println("Wrong PIN code");}




        }
    }}
