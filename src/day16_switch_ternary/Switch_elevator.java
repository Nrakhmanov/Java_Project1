package day16_switch_ternary;
import java.util.Scanner;
public class Switch_elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter floor number");

        int floorNum = scan.nextInt();

        switch(floorNum){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby,Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("floor 3 selected.Companies: Lyft, BofA, StakeJHouse");
                break;
            default:
                System.out.println("Invalid floor number");
        }
    }
}
