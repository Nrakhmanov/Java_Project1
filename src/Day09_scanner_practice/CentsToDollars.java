package Day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*        int cents = 659;
        int dollars = cents/100;
        int remainingCents = cents%100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remaining cents = " + remainingCents);
        System.out.println("In " + cents + " cents : "  + dollars + " dollars" + " and " + remainingCents + " cents");
*/

        System.out.println("enter amount of cents");
        int cents1 = input.nextInt();
        int dollars1 = cents1/100;
        int remainingCents1 = cents1%100;
        System.out.println("In " + cents1 + " cents : "  + dollars1 + " dollars" + " and " + remainingCents1 + " cents");


    }
}
