package Replets;
import java.util.*;
public class Zombies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        while(inhabitants>0){
            System.out.println("day" + day + "[" + inhabitants + "]");
            day ++;
            inhabitants /=2;
        }
        System.out.println("EXTINCT");

    }
}
