package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int count = 2;
        System.out.println("count = " + count);
        count++;
        System.out.println("count = " + count);
        ++count;
        System.out.println("count = " + count);
        
        count--;
        System.out.println("count = " + count);
        --count;
        System.out.println("count = " + count);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode+=1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);

        int students = 50, teachers;
        students = 100;
        System.out.println(students);
        
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);





    }   
}
