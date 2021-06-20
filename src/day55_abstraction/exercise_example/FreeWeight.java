package day55_abstraction.exercise_example;

public class FreeWeight extends Lifting {
    @Override
    public void perform() {
        System.out.println("Performing Lifting with free weights");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {

    }
}
