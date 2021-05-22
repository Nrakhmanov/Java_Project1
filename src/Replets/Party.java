package Replets;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, answer, guestList = "";

       do {
            System.out.println("Please enter guest name:");
            name = input.next();
            guestList += name;

            System.out.println("Do you want to enter new quest name:");
            answer = input.next();

            if(answer.equalsIgnoreCase("Yes")){
                guestList += ", ";
            }

        }while(answer.equalsIgnoreCase("yes"));

        System.out.println("Guest's list: " + guestList);


        }


    }



