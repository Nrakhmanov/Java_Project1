package Replets;

import java.util.Scanner;

public class CoffeineOverdose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of milligrams in drink:");

        int numOfMilligrams = scan.nextInt();
        int lethalCount = 10*1000/numOfMilligrams;

        System.out.println("it would take about " + lethalCount + " drinks for a lethal overdose");

    }
}
