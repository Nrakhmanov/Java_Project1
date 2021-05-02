package Day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price for milk:");
        double milk = input.nextDouble();
        System.out.println("Enter price for bread:");
        double bread = input.nextDouble();
        System.out.println("Enter price for eggs:");
        double eggs = input.nextDouble();
        double total = milk + bread + eggs;
        System.out.println("total price is :" + total);


    }
}
