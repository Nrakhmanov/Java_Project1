package day28_loops;

public class BreakVSContinue {
    public static void main(String[] args) {
        //BREAK STATEMENT

        for (int n = 1; n <= 5; n++) {
            System.out.print(n); //123
            if (n == 3) {
                break;
            }

        }
        System.out.println();

          //CONTINUE STATEMENT
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                continue;

            }
                    System.out.print(i); //135
                }
            }
        }
