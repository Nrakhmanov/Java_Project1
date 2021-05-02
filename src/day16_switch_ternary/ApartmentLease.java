package day16_switch_ternary;
import java.util.Scanner;
public class ApartmentLease {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Expensive apartments");
        System.out.println("Enter number of apartments");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1500;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 2100;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2500;
                break;
            default:
                System.out.println(numberOfBedrooms + " is currently unavailable");
        }

        System.out.println(numberOfBedrooms + " apartments current price is " + startingPrice);
    }
}
