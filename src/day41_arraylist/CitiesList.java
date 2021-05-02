package day41_arraylist;
import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");  // index 0
        cities.add("Singapore"); // index 1
        cities.add("Washington DC"); // index 2
        cities.add("Istanbul"); // index 3
        cities.add("Madrid"); // index 4

        //add another city at index 0
        cities.add(0, "Ashgabat");

        System.out.println(cities);

        //print first and last city

        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist

        System.out.println("count of items = " + cities.size());

        int size = cities.size();

        System.out.println("size = " + size);
        System.out.println("there are " + size + " cities in the list");

        int count = 0;
        for (int i = 0; i < cities.size(); i++) {
            count++;
            System.out.println(count + "-" + cities.get(i));

        }

        System.out.println();

        for (String each: cities) {
            System.out.print(each + " ");

        }
        System.out.println();

        cities.remove(0); //remove by index
        System.out.println(cities);

        cities.remove("Madrid"); //remove by object
        System.out.println(cities);

        cities.clear(); //remove all values
        System.out.println("cities = " + cities);


        System.out.println(cities.isEmpty());

        if(cities.isEmpty()){
            System.out.println("List is empty");
        }

        //check size() = 0;
        if(cities.size()==0){
            System.out.println("List is empty");
        }

    }
}

