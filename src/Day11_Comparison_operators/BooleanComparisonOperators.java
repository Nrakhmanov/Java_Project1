package Day11_Comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        /*
        == equals (checks if two values are equal)
        > greater than (checks if first value is greater than second. a>b
        < less than (checks if first value less than second. a<b
        >= greater than OR equal (checks if first value is greater than or equal to second a>=b
        <= less than OR equal (checks if first value is less than or equal to second a<=b
        != is not equal (checks if first value is NOT equal to second a!=b
         */

        System.out.println(10==10);
        System.out.println(20==10);
        System.out.println(10>9);
        System.out.println(20>30);
        System.out.println(9<10);
        System.out.println(40<30);
        System.out.println(5!=6);
        System.out.println(100!=100);
        System.out.println(34<=35);
        System.out.println(100>=1);
        

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        String city = "Denver";
        System.out.println(city == "Denver");
        System.out.println(city == "Dushanbe");
        System.out.println(city != "London");

        String name = "Nuri";
        boolean checkName = name == "Nuri";
        System.out.println("checkName = " + checkName);

        checkName = name != "Bambaloo";
        System.out.println("checkName = " + checkName);






    }
}
