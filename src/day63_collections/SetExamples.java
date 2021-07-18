package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(99);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);

        Set<String> words = new HashSet<>();

        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");

        System.out.println(words);

        //convert Set to a List

        List<String> wordsList = new ArrayList<>(words);
        System.out.println(wordsList.get(2));
        wordsList.add("world");
        System.out.println(wordsList);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("69");
        linkedHashSet.add("java");
        linkedHashSet.add("$$");
        linkedHashSet.add("mango");
        linkedHashSet.add("69");

        System.out.println(linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("69");
        treeSet.add("java");
        treeSet.add("$$");
        treeSet.add("mango");
        treeSet.add("Cucumber");
        treeSet.add("69");

        System.out.println(treeSet);

    }
}

