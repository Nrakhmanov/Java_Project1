package day52_inheritance;


public class Discord extends MobileApp {
    public void chat(String someone) {
        System.out.println("chatting with " + someone + " on Discord");
    }

    @Override
    protected boolean download() {
        System.out.println("Downloaded Discord  0.0.23 from Apps");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("myself");
    }
}
