package Replets;
import java.util.*;
public class PrintNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

     /*   int count = 0;
        while(count <n){
            System.out.print("*");
            count++;
        }

      */

     for(int i = 1; i<=n; i++){
         System.out.print("*");
     }
    }
}
