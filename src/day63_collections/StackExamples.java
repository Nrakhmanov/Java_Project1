package day63_collections;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {

        //LIFO -> Last In First Out

        Stack<String> booksStack = new Stack<>();

        booksStack.add("Harry Potter");

        booksStack.add("Leaders eat last");
        booksStack.add("Java Intro");

        System.out.println(booksStack);
        System.out.println("This is at the top of the stack - " + booksStack.peek());
        //System.out.println(booksStack.remove(0)); //removes item by index

        //booksStack.pop(); //removes and returns the top of the stack item
        //System.out.println(booksStack.pop());

        System.out.println(booksStack);
    }
}
