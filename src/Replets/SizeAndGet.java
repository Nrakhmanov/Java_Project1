package Replets;

import java.util.ArrayList;
import java.util.Scanner;

public class SizeAndGet {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i < size; i++) {
                list.add(in.nextInt());

            }
            int sum = 0;
        for (int each : list
             ) {
            sum+=each;
        }

        System.out.println(sum);

        }
}

