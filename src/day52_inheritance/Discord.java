package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone) {
        System.out.println("chatting with " + someone + " on Discord");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("myself");
    }
}
