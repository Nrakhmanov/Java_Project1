package Practice;


import java.util.Scanner;

public class Qualification_For_Army {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("are you Citizen or Resident");
        String citizenship = scan.next();

        if (citizenship.equals("Yes")){

        }else
            System.out.println("You must be citizen or resident of U.S.");
            System.out.println("You are not qualified");


        if(citizenship.equals("Yes")){
        System.out.println("Do you have High school diploma?");
        boolean Schooldiploma = scan.nextBoolean();
        if (!Schooldiploma)
            System.out.println("You must have high School diploma");
        }
        if(citizenship.equals("Yes")){
        System.out.println("enter your age");
        int age = scan.nextInt();
        if (age < 18 || age > 35)
            System.out.println("Your age must be between 18 and 35");
            System.out.println("You are not qualified");
        } else
            System.out.println("You are qualified");


    }

}

 /*   Given information: Citizenship(String), resident (boolean), and has high school diploma
        (boolean), and age(int). Determine if the person is qualified to join the army.
        - The person must be a Citizen of the USA or a resident
        -> If not print: You must be a U.S. citizen or a resident
        - Their age must be between 18 and 35
        -> If not print: Your age must be between 18 to 35 years old
        - They must have a high school diploma
        -> If not print: You must have a high school diploma
        > If all the criteria is met print: You are qualified for the US Army

  */