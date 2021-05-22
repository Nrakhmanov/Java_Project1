package Replets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appendPosSum {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){

        ArrayList<Integer> newList = new ArrayList<>();
        int sum = 0;
       for(Integer each : nums) {
           if(each>0){
               newList.add(each);
               sum += each;
           }
        }
            newList.add(sum);

       return newList;


    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
