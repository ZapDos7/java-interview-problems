package mathematics.primeNum;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(49)); // false
    }

    private static boolean isPrime(int n) {
        // edge cases
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        // loop for n > 2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        // else
        return true;
    }
}
