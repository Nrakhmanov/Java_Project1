package day27_loops;

public class IndexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 'g';
        int index = -1;

        for(int i=0; i<word.length(); i++){
           if(word.charAt(i) == letter){
                index = i;
                System.out.println(letter + " is found at index " + index);
                break; //if you want to exit loop or stop the loop.  return; command is more powerful and stops whole main method
            }
           }
        if(index == -1){
                System.out.println(letter + " is not present");
           }
        }
    }

