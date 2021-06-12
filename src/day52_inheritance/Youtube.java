package day52_inheritance;

public class Youtube extends MobileApp{
    public void watchClips() {
        System.out.println("Watching video clips");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
    }
}
