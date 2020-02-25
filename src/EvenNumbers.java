/**
 * This example shows that we don't always jump by 1
 * in a for loop.  The task here is to print out all
 * even numbers that are divisible by 6 but not by 4
 */
public class EvenNumbers {
    public static void main(String[] args) {
        // Even numbers divisible by 6
        for (int x = 2; x < 100; x = x + 2) {
            if (x % 6 == 0 && x%4 != 0) {
                System.out.println(x);
            }
        }
    }
}
