package Replets;

import java.util.*;

public class zombies2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;
        int sum = 0;
        do {
            sum = 0;
            System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
            for (int i = 0 ; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i]/2;
                sum += inhabitants[i];
            }
            count++;
        } while (sum!= 0);

        System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");


            }
        }




