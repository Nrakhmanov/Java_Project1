package day54_abstraction;

public class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("hand tossed, with alfredo sauce, chicken, mushrooms nad mozzarella cheese");
    }

    @Override
    public void serve() {
        System.out.println("Serve it sliced in pizza plate");

    }
}
