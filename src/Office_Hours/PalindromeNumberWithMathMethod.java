package Office_Hours;

public class PalindromeNumberWithMathMethod {
    public static void main(String[] args) {
        //System.out.println(112 % 10);//formula to read last digit
        //try it with arrays, and string manipulation
        System.out.println(isPalindrome(1234321));
        }
        public static boolean isPalindrome(int number){
            int reverse =0;
            int temp = number; // to keep variable "number" unchanged so you can check it with reverse number, you have to create temp

            while(temp != 0){ //infinite loop - make sure you change same variable

                int lastDigit = temp % 10;
                reverse = (reverse * 10) + lastDigit;
                temp/=10;
               // System.out.println(reverse);

            }
            return reverse == number;

        }


    }

