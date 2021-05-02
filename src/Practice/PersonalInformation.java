package Practice;
import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people you are living with?");
        int roomMates = scan.nextInt();

        if (roomMates < 2) {
            System.out.println("lives with less than 2 people");
        } else if (roomMates >= 3 && roomMates <= 6) {
            System.out.println("Lives with 3-6 people");
        } else if (roomMates > 6) {
            System.out.println("Lives with more then 6 people");
        }
        System.out.println("What city do you live in?");
        String city = scan.next();
        //System.out.println(city);
        System.out.println("do you live in downtown?");
        String downtown = scan.next();
        if (downtown.equals("Yes")) {
            System.out.println("do you thought about moving to suburbs?");
            String suburbs = scan.next();
            if (suburbs.equals("Yes")) {
                System.out.println("Do it. it is great");
            } else if (suburbs.equals("No")) {
            }
            System.out.println("Think about it");


            System.out.println("What is your favourite animal?");
            String animalfav = scan.next();
            System.out.println("Wow " + animalfav + " is a great animal");
            System.out.println("How many pets do you want?");
            int pet = scan.nextInt();
            System.out.println("do you want " + pet  + animalfav);
        }

    }

}