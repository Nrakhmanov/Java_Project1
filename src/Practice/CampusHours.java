package Practice;
import java.util.Scanner;
public class CampusHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter time in 24 hour format");
        int time = scan.nextInt();

        if(time>=8 && time<=23){
            System.out.println("Open");
        }else{
            System.out.println("Close");
        }

    }
}
