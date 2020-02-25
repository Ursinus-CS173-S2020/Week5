public class Primes {
    /**
     * 
     * @param x A number
     * @return true if x is prime, false otherwise
     */
    public static boolean isPrime(int x) {
        boolean result = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                result = false;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        for (int x = 2; x < 1000; x++) {
            if (isPrime(x)) {
                // If it's prime, print it out, next to 
                // the remainder after dividing by 6
                // (should be 1 or 5 for the early primes, since
                // they are next to a number divisible by 6)
                System.out.println(x + " " + x%6);
            }
        }
    }
    
}
