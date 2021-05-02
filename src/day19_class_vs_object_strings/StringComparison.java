package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Denver";

        System.out.println(city.equals("Denver"));
        System.out.println(city.equals("denver"));


        System.out.println(city.equalsIgnoreCase("DENVER"));
    }
}
