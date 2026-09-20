public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Runnable describes work; Thread is the worker that executes it.
        Runnable incrementOneThousandTimes = () -> {
            for (int index = 0; index < 1_000; index++) {
                counter.increment();
            }
        };

        Thread first = new Thread(incrementOneThousandTimes, "counter-1");
        Thread second = new Thread(incrementOneThousandTimes, "counter-2");

        first.start();
        second.start();

        // join() makes the main thread wait for both workers before reading the result.
        first.join();
        second.join();

        System.out.println("expected 2000, actual " + counter.getCount());
    }

    private static final class Counter {
        private int count;

        // Without synchronization, count++ is a read-modify-write race.
        private synchronized void increment() {
            count++;
        }

        private int getCount() {
            return count;
        }
    }
}
