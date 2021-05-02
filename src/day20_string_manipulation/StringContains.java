package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {

        String company = "Capital one"; //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("i")); //true


        if(company.contains(" ")){
            System.out.println("Multiple words company name");
        }else{
            System.out.println("Single word company name");
        }


        String etsyTitle = "Wooden spoot | Etsy";

        if(etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passsed");
        }else{
            System.out.println("Fail - title check failed");
        }

        String firstName = "nickelodeon";

        if(firstName.contains("i") && firstName.contains("n")){
            System.out.println("both i & n are present");
        }else {
            System.out.println("i || n not present");
        }


        String email = "Bambaloo@blue.com";

        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email");
        }else {
            System.out.println("invalid email");
        }

        if(email.toLowerCase().contains("b")){ //goes from left to right. first convert to lowercase and then check if "b"  is present.
            System.out.println("b is present");
        }else{
            System.out.println("b is not present");
        }




}



        }



