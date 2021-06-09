package day51_inheritance.super_keyword;

public class Lyft {
     double calculateRate (double miles) { // default access modifier (private->default->protected->public)
        return miles * 4.50;
    }

}
