package Replets;
import java.util.Scanner;
public class CoinMashine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter cents:");
        int cents = scan.nextInt();

        if(cents<0 || cents>100){
            System.out.println("Invalid cents amount");
        }else {

            int quarters = cents / 25;
            int dimes = (cents % 25) / 10;
            int nickels = ((cents % 25) % 10) / 5;
            int pennies = ((cents % 25) % 10) % 5;

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");

        }
    }
}
