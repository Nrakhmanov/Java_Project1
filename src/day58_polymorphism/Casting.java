package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new SuperMan();
        worker.work("SDET");
        worker.getPaid();

        ((Father)worker).raiseKid();


        //DOWNCASTING FROM WORKER TO SUPERMAN
        SuperMan superMan = (SuperMan) worker;

        superMan.feedKid();
        superMan.work("Developer");
    }
}
