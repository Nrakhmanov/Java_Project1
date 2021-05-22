package Replets;

import java.util.Scanner;

public class PalindromNumberWithStringMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){

        int temp = num;
        String reverseStr = "";

        while(temp > 0){
            reverseStr += temp % 10;
            temp /=10;
        }
        int reverse = Integer.parseInt(reverseStr);
        System.out.println(reverse == num);
    }
}
