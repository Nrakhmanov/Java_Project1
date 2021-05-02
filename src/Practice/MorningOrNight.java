package Practice;
import java.util.Scanner;
public class MorningOrNight {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
       int hours = scan.nextInt();

       /* if(hours>=0 && hours <=11){
            System.out.println("Morning");
        }else if(hours>=12 && hours<= 24){
            System.out.println("Night");
        }

        */




                if(hours<0 && hours>24){
                System.out.println("Invalid time input");
        }

                Boolean night = (hours>=12 && hours <= 24);
                Boolean morning = (hours>=0 && hours <=11);
                String time = (morning)? (night) ? "Morning" : "Night": "invalid time";
                System.out.println(time);





    }
}
     //  0 - 11 : Morning
      // 12- 24 : Night