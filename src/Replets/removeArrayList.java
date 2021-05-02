package Replets;

import java.util.ArrayList;
import java.util.Scanner;

public class removeArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        list.remove(1);
        list.remove(0);





        // Do not touch below
        System.out.println(list);

    }
}
