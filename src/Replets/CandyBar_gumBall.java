package Replets;
import java.util.Scanner;
public class CandyBar_gumBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons= scan.nextInt();
        int candyBar = coupons/10;
        int gumBalls = (coupons%10)/3;


        if(coupons>3){
            System.out.println("Number of Candies: " + candyBar);
            System.out.println("Number of Gumballs: " + gumBalls);
        }else if(coupons < 3){
            System.out.println("Not enough coupons");
        }

    }
}
