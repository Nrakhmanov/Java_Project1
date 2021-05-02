package quizes;

import java.util.Arrays;

public class ArraysQuiz {
    public static void main(String[] args) {
char [] array = {'D', 'B','C','A'};
Arrays.sort(array);

for(char each : array){
    System.out.println(each + " ");
    if(each=='D'){
        continue;
    }
}


    }
}
