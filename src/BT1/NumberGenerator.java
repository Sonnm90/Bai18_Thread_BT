package BT1;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        System.out.println("Generator hashCode: " + hashCode());
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
