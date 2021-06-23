package day56_abstraction.driveable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.bye();

        Plane plane = new Plane();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.bye();
        plane.land();


        SelfDrivable sd = new Plane();// POLYMORPHISM
        SelfDrivable sd2 = new Tesla();
    }


}
