package quizes;

public class StringQuiz {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta+ tb;
        ta = ta.replace('C','D');
        System.out.println(ta);
    }
}
