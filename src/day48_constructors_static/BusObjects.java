package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.driver = new Driver("Shopir");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());


    }
}
