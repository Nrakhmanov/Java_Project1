package Day13_conditional_statements;
import java.util.Scanner;
public class IfWithBooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are hungry. Enter true or false");

        boolean isHungry = scan.nextBoolean();

        if(isHungry == true){
            System.out.println("I am hungry. I will go get something to eat");
            System.out.println("then code Java");
        }else{
            System.out.println("I am not hungry. Let's keep coding Java");
        }

        double price = 130.44;
        boolean isAffordable = price<=200;

        if(isAffordable){
            System.out.println("This item is affordable");
        }else{
            System.out.println("not affordable");
        }
    }
}
