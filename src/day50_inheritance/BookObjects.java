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

        AudioBook audiobook = new AudioBook();
        audiobook.author = "Unmesh";
        audiobook.length = 60;
        audiobook.narrator = "Somebody";
        audiobook.price = 44.99;
        audiobook.title = "Selenium Cook Book";
        audiobook.type = "Automation";
        audiobook.listen();


        EBook eBook = new EBook();
        eBook.title = "Java Data Structures";
        eBook.author = "Savitch";
        eBook.type = "Programming";
        eBook.price = 85.0;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readbook();
    }
}
