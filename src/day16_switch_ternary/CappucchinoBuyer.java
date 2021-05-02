package day16_switch_ternary;
import java.util.Scanner;
public class CappucchinoBuyer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What size of Cappuccino you want");
        String cupSize = input.next();
        double price = 0;
        int calories = 0;

        switch(cupSize){
            case "tall":
                System.out.println("Tall Cappuccino please");
                System.out.println("Price - 3.69");
                price=3.69*1.3;
                System.out.println("Calories - 90");
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                System.out.println("Price - 3.99");
                price=3.99*1.3;
                System.out.println("Calories - 120");
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                System.out.println("Price - 4.29");
                price=4.29*1.3;
                System.out.println("Calories - 150");
            break;
            default:
                System.out.println("We don't serve " + cupSize + " Capuccino");


        }
        System.out.println("Total price is " + price);

    }
}
