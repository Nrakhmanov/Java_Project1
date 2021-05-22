package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("type of animal = " + animal.type);
        animal.LifeStyle();
        animal.Nickname();
        animal.speak();

        Animal cheetahObj = new Animal();
        System.out.println(cheetahObj.type);
        cheetahObj.type = "Cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.LifeStyle("zebras");
    }
}
