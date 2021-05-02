package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting : world smallest cat \uD83D\uDC08 by BBC");
       //video is 1 min 57 seconds
        int seconds = 0;
        while(seconds <=117){
            System.out.println("Watching YouTube video at second: " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching Cat video, lets start another one");





    }
}
