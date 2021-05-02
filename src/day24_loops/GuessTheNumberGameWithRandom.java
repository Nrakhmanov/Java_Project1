package day24_loops;
import java.util.*;
public class GuessTheNumberGameWithRandom {
    public static void main(String[] args) {

          Random randomNum = new Random();
          Scanner scan = new Scanner(System.in);
         // System.out.println(randomNum.nextInt(101));
         int secretNumber = randomNum.nextInt(101);//creates any random number between 0 and 100( 101 not inclusive)
          int guessingNumber;
          int trials = 10;

          do{
              System.out.println("Guess the secret number");
              guessingNumber = scan.nextInt();
              //trials++;

               if(guessingNumber>secretNumber){
                  System.out.println("Wrong, your number is too large");
              }else if(guessingNumber<secretNumber){
                  System.out.println("wrong, your number is too small");
              }
          }while(guessingNumber != secretNumber);
        System.out.println("Congratulations. you won! your secret number is : " + secretNumber);





    }
}
