package day14_multibranch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;

        if (year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask and keep 6 feet social distance");

        }

        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington D.C. is capital");

        }
        System.out.println("Welcome to " + country);

    }
}
