package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 10;

        if(number < 1 || number> 10){
            System.out.println("ERROR: invalid input");
            return;
        }
            for (int multi = 1; multi < 11; multi++) {

                System.out.println(number + "x" + multi + "=" + number * multi);

                }

            }

    }

