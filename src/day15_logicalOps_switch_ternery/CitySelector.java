package day15_logicalOps_switch_ternery;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";

        if(city.equals("Singapore") || city.equals("Tampa")){
            System.out.println("willing to relocate to " + city);
        }else{
            System.out.println("Not considering - " + city);
        }

        String teacher = "Saim";

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is Java class with " + teacher);
        }else{
            System.out.println("Soft skill class with Nadir");
        }


    }
}
