package Replets;
import java.util.Scanner;
public class ternary_replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:

        int y = (x>=5)? x : -x;
        System.out.println(y);
    }
}
