package Replets;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int a = email.indexOf("_");
        int b = email.indexOf("@");


        if(email.contains("_")){

            String first = email.substring(0,a);
            String second = email.substring(a+1,b);

            System.out.println(second + "_" + first + email.substring(b));

        }else{
            System.out.println(email);
        }
        }

    }

