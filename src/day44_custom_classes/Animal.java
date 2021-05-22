package day44_custom_classes;

public class Animal {

    String type = "Orca";

    public void LifeStyle() {
        System.out.println("Hunts, kills and eats them");

    }

    public void LifeStyle(String action){
        System.out.println("Hunts " + action + ", kills and eats them");
    }

    public void Nickname() {
        System.out.println("Predator");
    }

    public void speak(){
        System.out.println("speaking");
    }

}

