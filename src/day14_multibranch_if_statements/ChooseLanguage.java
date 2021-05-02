package day14_multibranch_if_statements;
import java.util.Scanner;
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number to choose your language");
        int selection = scan.nextInt();

        if(selection == 1){
            System.out.println("Hello. Thanks for your call");
        }else if(selection == 2){
        System.out.println(" hola, gracias para llamar");
        }else if(selection == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }else if(selection == 4){
            System.out.println("Zdravstvuyte, spasibo za zvonok");
        }else{
            System.out.println("Let's talk Java and english, hello");
        }


    }
}
