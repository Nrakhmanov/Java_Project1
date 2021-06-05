package day50_inheritance;

public class EBook extends Book{

    double size;
    int pages;

    public void readbook() {
        System.out.println("I am reading EBook : ");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Size of the EBook = " + size);
        System.out.println("Contains = " + pages + " pages");
    }


}
