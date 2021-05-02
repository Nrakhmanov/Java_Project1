package Day13_conditional_statements;
import java.util.Scanner;
public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter today's temperature");
        int temp = scan.nextInt();

        if(temp>=70){
            System.out.println("it is a beautiful day");
            System.out.println("Let's code Java");
        }else{
            System.out.println("It is kind of cold today");
            System.out.println("Stay home and code Java");
        }
    }
}
