package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding Java");
        }else{
            System.out.println("List is not empty, code Java then go to Mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("CZ Shadow2");
        shoppingList.add("Java book");
        shoppingList.add("hunter knife");
        shoppingList.add("Tesla");
        System.out.println(shoppingList);

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding Java");
        }else{
            System.out.println("List is not empty, code Java then go to Mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("are there shoes in my list? " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("Good, shoes are in the list");
        }else{
            System.out.println("Dementia");
        }
        System.out.println("Buying shoes....$120");

        shoppingList.remove("shoes");
        System.out.println(shoppingList);

        shoppingList.clear(); //remove all elements from list
        System.out.println(shoppingList);

    }
}
