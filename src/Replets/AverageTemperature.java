package Replets;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps

        double total = 0;
        double sum = 0;
        for(double each : temps){
            sum +=each;
            total = sum/ temps.length;


        }
        System.out.println(total);
    }
}
