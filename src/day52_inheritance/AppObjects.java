package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);
        instagram.setVersion(2.3);
        instagram.download();

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.useTheApp(150);
        discord.download();
        discord.printInfo();

        Youtube youtube = new Youtube();
        youtube.setName("Youtube");
        youtube.useTheApp(200);
        youtube.setVersion(1.2);
        youtube.download();
    }
}
