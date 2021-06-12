package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "Youtube";
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);
        instagram.version = 2.3;
        instagram.download();

        Discord discord = new Discord();
        discord.name = "Discord";
        discord.useTheApp(150);
        discord.download();

        Youtube youtube = new Youtube();
        youtube.name = "Youtube";
        youtube.useTheApp(200);
        youtube.version = 1.2;
        youtube.download();
    }
}
