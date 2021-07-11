package Replets.book_shelf;

public class Testing {
    public static void main(String[] args) {
        String word = "bAMBALOO";

        word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(word);
    }
}
