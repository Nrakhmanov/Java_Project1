package day62_collections;


import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        List<String> states = new Vector<>();

        states.add("CO");
        states.add("NY");
        states.add("IL");
        states.add("PA");
        states.add("MD");
        states.add("NV");

        System.out.println(states);
        //VECTOR is synchronized
    }
}
