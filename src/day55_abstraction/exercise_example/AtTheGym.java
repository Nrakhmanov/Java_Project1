package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {

        Exercise exercise = new Running();

        Running running = new Running();
        running.perform();
        System.out.println("running.getCaloriesCount(30) = " + running.getCaloriesCount(30));

        Swimming swimming = new Swimming();
        swimming.perform();
        System.out.println("swimming.getCaloriesCount(30) = " + swimming.getCaloriesCount(30));

        FreeWeight freeweight = new FreeWeight();
        freeweight.perform();
        System.out.println("freeweight.getCaloriesCount() = " + freeweight.getCaloriesCount(60));
    }
}
