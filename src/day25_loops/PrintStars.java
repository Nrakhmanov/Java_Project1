package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int i = 1; i<=15; i++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";

        for(int i = 1; i<=5; i++){
            myStars += "* ";

        }
        System.out.println("my stars = " + " " + myStars.trim()); //put printing outside the loop, otherwise it will print all steps
    }                                                                                            //to get rid of spaces use .trim()
}
