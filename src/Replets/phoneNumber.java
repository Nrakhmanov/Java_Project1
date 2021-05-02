package Replets;
import java.util.Scanner;
public class phoneNumber {
    public static void main(String[] args) {
        System.out.println("Enter your area code: ");
        System.out.println("Enter your local number: ");
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUT CODE HERE:


        phoneNumber = "(" + areaCode + ")" + "-" + localNumber;
        System.out.println("Calling number " + phoneNumber);

    }
}
