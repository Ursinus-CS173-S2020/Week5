/**
 * Showing an example of accessing String characters
 * and counting their length
 */
import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word that is 6 characters long and has an 'e' as the third character");
        String word = in.next();
        System.out.println("You entered " + word);
        if (word.length() != 6) {
            System.out.println("Not 6 characters!");
        }
        char thirdChar = word.charAt(2);
        if (thirdChar != 'e') {
            System.out.println("Third character was not 'e'");
        }
        if (word.length() == 6 && thirdChar == 'e') {
            System.out.println("You did it!");
        }
        
    }
}
