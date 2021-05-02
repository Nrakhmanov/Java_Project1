package day25_loops;
import java.util.*;
public class FizzBuzzForLoop {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("enter start number and end number");
int start = scan.nextInt();
int end = scan.nextInt();
        if(start>=end){
            System.out.println("reverse numbering is not supported");}
        for (int n = start; n <= end; n++) {
             if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(n);
            }

        }
    }
}

