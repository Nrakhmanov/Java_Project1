package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7, 11, 19, 23);
        System.out.println("nums = " + nums);
        //nums.add(100); not working here. We cannot change size of array.aslist
        //nums.remove(11);
        
        List<Integer> numsList = new ArrayList<>(Arrays.asList(17, 29, 31, 37, 41));
        numsList.add(47);
        numsList.add(53);
        System.out.println("numsList = " + numsList);
        numsList.remove(new Integer(29));//to remove by value
        System.out.println("numsList = " + numsList);


        List<String>drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount = 0;
        for (String drink:drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " ---> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("pepsi") || drink.equals("coke") || drink.equals("mdew")) {
                caffeineAmount = 111;
                System.out.println(drink + " ---> " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("kambucha")) {
                caffeineAmount = 35;
                System.out.println(drink + " ---> " + caffeineAmount);
            }


            switch (drink){
               case "celsius": case "monster": case "red bull":
                       caffeineAmount = 150;
                   System.out.println(drink + " ---> " + caffeineAmount);
                   break;
               case"coffee": case"pepsi": case"coke": case"mdew":
                   caffeineAmount = 112;
                   System.out.println(drink + " ---> " + caffeineAmount);
                   break;
               case"tea": case"kambucha":
                   caffeineAmount = 35;
                   System.out.println(drink + " ---> " + caffeineAmount);
                   break;
           }

        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(drink -> {
            System.out.println("drink = " + drink);
        });

        List<Integer> num = Arrays.asList(1, 2, 3, 4);




    }
}

