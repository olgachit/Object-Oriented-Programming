import java.util.Random;

public class Task2 {
    static class SumTask extends Thread{
        private int[] array;
        private long result;
        private int start, end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.result = 0;
        }

        public long getResult() {
            return result;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                result += array[i];
            }
        }

        public  static void main(String[] args) {
            int size = 100_000;
            int[] numbers = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                numbers[i] = rand.nextInt(100);
            }

            int cores = Runtime.getRuntime().availableProcessors();
            System.out.println("Available processors: " + cores);
            int chunkSize = size / cores;
            SumTask[] tasks = new SumTask[cores];

            for (int i = 0; i < cores; i++) {
                int start = i * chunkSize;
                int end = (i == cores - 1) ? size : start + chunkSize;
                tasks[i] = new SumTask(numbers, start, end);
                tasks[i].start();
            }

            long totalSum = 0;
            for (int i = 0; i < cores; i++) {
                try {
                    tasks[i].join();
                    totalSum += tasks[i].getResult();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // compute sum sequentially (to verify correctness)
            long checkSum = 0;
            for (int num : numbers) {
                checkSum += num;
            }

            System.out.println("Parallel sum = " + totalSum);
            System.out.println("Sequential sum = " + checkSum);
        }
    }
}
