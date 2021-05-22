package day45_OOP;

public class TrafficLightObjects {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.color = "red"; // this way of assigning is not preferable.
        // better to assign through method. this, we can control it.
        // in the method we can add if condition etc. Easier to control and manipulate.

        trafficLight.changeColor("red"); //assigning through method
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();




    }
}
