import java.util.Scanner;

/**
 * Created by john.tumminelli on 10/14/16.
 */
public class Excercise06 {
    public static void main(String[] args) {
        System.out.println("enter a the word:");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();
        isPalindrome(test);
        if (isPalindrome(test)){
            System.out.println(test + " is a Palindrome!");
        }
        else {
            System.out.println(test + " is NOT a Palindrome");
        }



    }
    public static boolean isPalindrome (String test) {
        int length = test.length();
        for ( int i = 0; i < (length /2); i++) {
            if (test.charAt(i) != test.charAt(length - i - 1)){
                return false;
            }


        }
        return true;
    }
}
