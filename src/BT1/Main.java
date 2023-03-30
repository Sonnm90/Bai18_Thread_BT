package BT1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1);
        thread1.setName("Thread 1");
        thread1.setPriority(Thread.MAX_PRIORITY);

        Thread thread2 = new Thread(generator2);
        thread2.setName("Thread 2");
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
