package day54_abstraction;

public class Salad extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("Lettuce, tomato, onion, cucumber, salt, pepper and dressing");
    }

    @Override
    public void serve() {
        System.out.println("Serve on big plate");

    }
}
