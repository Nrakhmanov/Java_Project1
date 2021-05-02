package Replets;
import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int player = scan.nextInt();
        int house = scan.nextInt();

        if (player>21 && house<21){
            System.out.println("player bust");
        }else if(house<=21 && house>player){
            System.out.println("player loss");
        }else if (player<=21 && player == house){
            System.out.println(" its a tie");
        }else if(player <=21 && player>house){
            System.out.println("player win");
        }

    }
}
