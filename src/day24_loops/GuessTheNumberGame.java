package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretNumber = 50;

        int guessingNumber;

        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber){
                System.out.println("Wrong, your number is too large");
            }else if(guessingNumber<secretNumber){
                System.out.println("Wrong, your number is too small");
            }
        }while(secretNumber!=guessingNumber);

        System.out.println("Congratulations, you won! secret number is " + secretNumber);


    }
}
