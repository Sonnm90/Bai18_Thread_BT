package BT3;

public class LazyPrimeFactorization implements Runnable {
    private int number = 2;

    @Override
    public void run() {
        while (true) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
