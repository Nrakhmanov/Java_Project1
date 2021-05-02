package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;//if value is more than 10 it will print out 1 time assigned value and exit the loop

        do{
            System.out.println("counter = " + count);
            count+=5;
        }
        while(count<=1000);

    }
}
