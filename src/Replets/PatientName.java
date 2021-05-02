package Replets;
import java.util.Scanner;
public class PatientName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Patient Personal Information");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        scan.nextLine();
        System.out.println("enter your last name");
        String lastName = scan.next();
        scan.nextLine();


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zipcode");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are your married?");
        boolean isMarried = scan.nextBoolean();
        System.out.println("Patient personal information");
        System.out.println("Fulle name: " + lastName + "," + firstName);
        System.out.println("Addres: " + street + "," + city + "," + state + " " + zipcode);
        System.out.println("Contacts:work phone number - " + workPhoneNumber + "," + "personal phone number - " + personalPhoneNumber + "," + "email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);
    }
}
