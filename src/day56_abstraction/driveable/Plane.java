package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 25) + " to fly " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for choosing our airlines");
    }

    public void land() {
        System.out.println("Landing plane");
    }
}
