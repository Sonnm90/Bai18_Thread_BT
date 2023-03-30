package BT3;

public class OptimizedPrimeFactorization implements Runnable {
    private int number = 2;

    @Override
    public void run() {
        while (true) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
