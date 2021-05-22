package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
       // car1.model = "Nissan Altima"; ERROR. because model and year variables are PRIVATE and can not be accessed from different class
       // car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println(car1.getModel());

        car1.setYear(2020);
        System.out.println(car1.getYear());

        car1.setMileage(10000);
        System.out.println(car1.getMileage());

        System.out.println(car1.toString());

        System.out.println(car1); //automatically calls .toString method

       // Car alfaRomeo = new Car();

      //  alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
     //   alfaRomeo.setYear(2017);
     //   alfaRomeo.setMileage(16604);

      //  System.out.println(alfaRomeo);


    }
}
