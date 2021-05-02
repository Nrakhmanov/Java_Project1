package day24_loops;
import java.util.Scanner;
public class GiveMeFiveDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me 5 dollars");
        int dollar = scan.nextInt();
        while(dollar != 5){
            System.out.println("give me 5 dollars");
            dollar = scan.nextInt();

        }
        System.out.println("Thank you for 5 dollars");
    }
}
