package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";

        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); //false

        if(!veggie.isEmpty());
        System.out.println("We have carrots");


    }
}
