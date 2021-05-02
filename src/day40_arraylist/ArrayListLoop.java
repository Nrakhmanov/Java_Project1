package day40_arraylist;

import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println("nums size = " + nums.size());

        nums.add(7); nums.add(45);
        nums.add(21); nums.add(91);
        nums.add(44); nums.add(77);
        nums.add(69); nums.add(66);
        nums.add(21); nums.add(213);
        nums.add(99); nums.add(435);

        System.out.println("nums = " + nums);

        nums.remove(2);//remove by index
        System.out.println("nums = " + nums);

        nums.remove(new Integer(7));//to remove by value use this method
        System.out.println("nums = " + nums);

        //for loop - iterate through all values and print

        for (int i = 0; i <nums.size(); i++) {
            System.out.println(nums.get(i));

        }

        //for each loop
        System.out.println();
        for (int each:nums) {
            System.out.print(each + " ");

        }




    }
}
