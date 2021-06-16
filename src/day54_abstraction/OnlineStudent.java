package day54_abstraction;

public class OnlineStudent extends Student {

    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using Zoom");
    }

    //public abstract void askQuestion(); ERROR - abstract method cannot be in normal class (non-abstract class)
}

