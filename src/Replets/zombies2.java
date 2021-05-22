package Replets;

import java.util.*;

public class zombies2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt()};

        int days = 0;


        /*
        new int[8] --> int array : 0,0,0,0,0,0,0,0
        !Arrays.equals(inhabitants, new int[8]) --> keep running the loop as long as inhabitants are not all 0
         */

        while(!Arrays.equals(inhabitants, new int[inhabitants.length])){

            int[] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            for (int i = 0; i < inhabitants.length ; i++) {
                if(inhabitants[i] == 0){
                    if(i == 0){
                        temp[i+1] = temp[i+1]/2;
                    }else if(i == inhabitants.length-1){
                        temp[i-1] = temp[i-1]/2;
                    }else{
                        temp[i+1] = temp[i+1]/2;
                        temp[i-1] = temp[i-1]/2;
                    }
                }

            }
            inhabitants = Arrays.copyOf(temp, temp.length);

            System.out.println("Day: + " + days++ + " " + Arrays.toString(inhabitants));

        }

        System.out.println("------EXTINCT------");

            }
        }




