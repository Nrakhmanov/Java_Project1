package day53_inheritance.tesla;

public class Roadster extends ElectricCar{

    public Roadster(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
    }

    //Roadster r = new Roadster("Roadster", 200000, 2022, 621);
}
