package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;


    public static void displayMessage(String message) {
        System.out.println("message : " + message);
        //System.out.println("num = " + num);// ERROR: num is instance variable. we cannot use it without declaring an object
        System.out.println("count = " + count);
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("blue bambaloo");
    }

    public void instanceMethod() {
        System.out.println("instance method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from the other side");

        //StaticMethods.instanceMethods(); --> not gonna work. need object
        // StaticMethods st = new StaticMethods
        //st.instanceMethod();
    }


}
