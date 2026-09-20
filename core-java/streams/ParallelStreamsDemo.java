import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamsDemo {
    public static void main(String[] args) {
        int size = 10_000;
        // int size = 10_000_000;

        List<Integer> numbers = new ArrayList<>(size);

        Random ran = new Random();

        // for (Integer number : numbers) { // it will not work, need to check why.
        // int randomNumber = ran.nextInt(100);
        // System.out.println("number: " + number + ", randomNumber: " + randomNumber);
        // numbers.add(randomNumber);
        // }

        for (int i = 0; i < size; i++) {
            int randomNumber = ran.nextInt(10);
            // System.out.println("i: " + i + ", randomNumber: " + randomNumber);
            numbers.add(randomNumber);
        }

        // System.out.println("Size: " + numbers.size() + " : " + numbers);

        // parallelStream() may use multiple threads. It is not automatically faster;
        // the work must be large enough to repay the splitting/coordination overhead.

        long seqStart = System.currentTimeMillis();
        int sum2 = numbers.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException exception) {
                        Thread.currentThread().interrupt();
                    }
                    return n * n;
                }).mapToInt(i -> i).sum();
        long seqEnd = System.currentTimeMillis();

        long paraStart = System.currentTimeMillis();
        int sum3 = numbers.parallelStream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
            return n * n;
        }).mapToInt(i -> i).sum();
        long paraEnd = System.currentTimeMillis();

        System.out.println("sum2: " + sum2 + ", sum3: " + sum3);
        System.out.println("Time for sequential: " + (seqEnd - seqStart));
        System.out.println("Time for parallel: " + (paraEnd - paraStart));

    }
}
