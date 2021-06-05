package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Savitch";
        book.type = "Programming book";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);

    }
}
