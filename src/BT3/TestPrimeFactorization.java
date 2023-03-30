package BT3;

public class TestPrimeFactorization {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization();

        Thread t1 = new Thread(lazy);
        Thread t2 = new Thread(optimized);

        t1.start();
        t2.start();
    }
}
