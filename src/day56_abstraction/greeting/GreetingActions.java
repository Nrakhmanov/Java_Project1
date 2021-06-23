package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greeting gt = new MountainLanguage();// POLYMORPHISM
        gt.hi();
        gt.bye();
    }
}
