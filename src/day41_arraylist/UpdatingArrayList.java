package day41_arraylist;

import java.sql.SQLOutput;
import java.util.*;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");
        myCars.add(1,"Lada");
        myCars.add(2,"Yugo");

        System.out.println(myCars.toString());
        String allCarsInOneSt = myCars.toString();
        System.out.println("allCarsInOneSt = " + allCarsInOneSt);//saves all cars in one String

        myCars.set(0, "BMW"); // change value at index 0 to different one
        System.out.println("after set = " + myCars.toString());

        myCars.set(4, "Honda");
        System.out.println("after set = " + myCars.toString());

        /*
        if myCars would be array
        myCars[4] = "Honda";
         */

        System.out.println(myCars.indexOf("Ford"));
        myCars.set(5, "Porsche");
        int moskvichIndex = myCars.indexOf("Moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);
        myCars.set(6, "Jiguli");
        System.out.println("After set to jiguli = " + myCars);

        myCars.set(myCars.indexOf("Toyota"), "Trabant");
        System.out.println(myCars);

        if(myCars.contains("Lada")){
            myCars.set(myCars.indexOf("Lada"), "Bugatti");
        }else{
            System.out.println("Lada is not found");
        }

        System.out.println(myCars);

        for (int i = 0; i < myCars.size() ; i++) {
            if(myCars.get(i).equalsIgnoreCase("Yugo")){
                myCars.set(i, "Prius");
            }if(myCars.get(i).equalsIgnoreCase("Trabant")){
                myCars.set(i, "Lexus");
            }if(myCars.get(i).equalsIgnoreCase("Jiguli")){
                myCars.set(i, "Audi");
            }

        }
        System.out.println(myCars);



    }
}