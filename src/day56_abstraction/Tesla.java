package day56_abstraction;

public class Tesla extends Transportation implements SelfDrivable, Greeting{

    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people onroads");
    }


    @Override
    public void cost(int mile) {

        System.out.println("Tesla costs " + (mile * 0.10) + " to drive " + " miles");

    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving on autonomous mode");
    }

    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }
}
