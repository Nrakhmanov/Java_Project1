package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());

        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());

        myCoffee.drink(25);
        System.out.println("amount after drinking = " + myCoffee.getAmount());

        myCoffee.setType("Irish coffee");
        System.out.println("I like to drink " + myCoffee.getType());

        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("Tequila");
        System.out.println("second coffee type = " + coffee1.getType());

        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("coffee1 type = " + coffee1.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");

        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null; //  reference variable does not refer/point to any object in HEAP
        coffee4.setType("Turkish");// NullPointerException Error








    }
}
