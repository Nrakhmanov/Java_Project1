package day54_abstraction;

public class DinnerTime {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.serve();

        Salad salad = new Salad();
        salad.prepare();
        salad.serve();
    }
}
