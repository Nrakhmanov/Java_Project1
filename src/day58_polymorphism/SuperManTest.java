package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {

        Father dad = new SuperMan();
        dad.feedKid();
        dad.playWithKid();
        dad.raiseKid();
       // dad.work("SDET") --> ERROR; because dad is Father variable and can access only methods in Father class

        Worker worker = new SuperMan();
        worker.work("SDET");
        System.out.println("got paid $ " + worker.getPaid());

        SuperMan sp = new SuperMan();
        sp.getPaid();
        sp.work("Scrummy");
        sp.feedKid();
        sp.playWithKid();
        sp.raiseKid();



    }
}
