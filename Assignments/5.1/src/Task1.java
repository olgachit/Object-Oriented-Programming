public class Task1 {
    public static void main(String[] args) {
        int max = 19;
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= max; i += 2) {
                System.out.println("Even Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= max; i += 2) {
                System.out.println("Odd Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Printing complete.");
    }
}