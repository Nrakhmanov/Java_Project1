package Replets;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

         String prefix = str.substring(0,n);
         String suffix = str.substring(n);

         if(!str.isEmpty() && n>=1 && n<=str.length()) {
             if (str.startsWith(prefix) && suffix.contains(prefix)) {
                 System.out.println("true");
             } else {
                 System.out.println("false");
             }


         }

    }
}
