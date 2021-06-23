package day56_abstraction.driveable;

public interface SelfDrivable {
    void autoPiloting();

    public default void selfPark() { // "default" - is a keyword which we can use only in interface class
        System.out.println("performing self park steps"); // adding default method will not create related problem in sub classes
    }

}
