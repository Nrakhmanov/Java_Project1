package day62_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> friends = new LinkedList<>();
        List<Integer> scores = new LinkedList<>();

        scores.add(99);
        scores.add(69);
        scores.add(33);
        scores.add(11);
        scores.add(7);
        scores.add(69);

        System.out.println(scores);
        System.out.println("First score = " + scores.get(0));

        friends.add("Superman");
        friends.add("Batman");
        friends.add("Aquaman");

        friends.addFirst("Wonder Woman");

        System.out.println(friends);

    }
}
