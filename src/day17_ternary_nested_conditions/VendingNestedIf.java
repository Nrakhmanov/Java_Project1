package day17_ternary_nested_conditions;
import java.util.Scanner;
public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your selection - drink or snack");

        String selection = scan.next();

        if(selection.equals("drink")){
            System.out.println("enter your drink item");
            String drinkItem = scan.next();
        if(drinkItem.equals("tea")){
            System.out.println("tea is selected");
            System.out.println("price is 2 dollars");
        }else {
            System.out.println("coke is selected");
            System.out.println("price is 3 dollars");
        }}

        else{

            System.out.println("enter your snack item");
            String snackItem = scan.next();
            if(snackItem.equals("chips")){
                System.out.println("chips is selected");
                System.out.println("price is 1.5 dollars");
            }else{
                System.out.println("candy is selected");
                System.out.println("price is 1 dollar");
            }}

    }
}
