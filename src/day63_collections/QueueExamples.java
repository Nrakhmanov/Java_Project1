package day63_collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {


        Queue<String> queue = new ArrayDeque<>();
         queue.add("one");
//        queue.add("two");
//        queue.add("three");
//        queue.add("four");
//        queue.add("five");

        System.out.println(queue.element()); //looking at the top element. Throws exception of there is no element
        System.out.println(queue.peek()); //looking at the top element. returns null if there is no element

        System.out.println(queue.remove()); //removes top element. Throws NoSuchElement Exception if there is no element
        System.out.println(queue.poll()); //removes top element. returns null if there is no element

        System.out.println(queue);


    }
}
