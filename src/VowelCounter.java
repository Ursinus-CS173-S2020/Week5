import java.util.Scanner;
public class VowelCounter {
    
    /**
     * 
     * @param c A char holding a single character
     * @return true if c is a vowel, false otherwise
     */
    public static boolean isAVowel(char c) {
        boolean result = false;
        // Is c 'a'/'A', 'e'/'E', 'i'/'I', 'o'/'O', 'u'/'U'
        if (c == 'a' || c == 'A') {
            result = true;
        }
        else if (c == 'e' || c == 'E') {
            result = true;
        }
        else if (c == 'i' || c == 'I') {
            result = true;
        }
        else if (c == 'o' || c == 'O') {
            result = true;
        }
        else if (c == 'u' || c == 'U') {
            result = true;
        }
        return result;
    }
    
    /**
     * 
     * @param s A String
     * @return The number of vowels in the string
     */
    public static int getNumVowels(String s) {
        int num = 0;
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if (isAVowel(c)) {
                num++;
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = in.next();
        int vowels = getNumVowels(word);
        System.out.println(word + " has " + vowels + " vowels");
    }
}
