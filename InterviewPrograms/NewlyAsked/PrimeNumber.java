public class PrimeNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(Integer number) {
        // Checking the number is smaller than or equal to 1
        // If yes then its not a Prime number
        if (number <= 1) {
            return false;
            // If the number is 2 or 3 this condition is for that
        } else if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
