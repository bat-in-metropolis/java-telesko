import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
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

        int sum1 = numbers.stream().map(n -> n * n).reduce(0, (c, e) -> c + e);

        long seqStart = System.currentTimeMillis();
        int sum2 = numbers.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    return n * n;
                }).mapToInt(i -> i).sum();
        long seqEnd = System.currentTimeMillis();

        long paraStart = System.currentTimeMillis();
        int sum3 = numbers.parallelStream().map(n -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            return n * n;
        }).mapToInt(i -> i).sum();
        long paraEnd = System.currentTimeMillis();

        System.out.println("sum2: " + sum2 + ", sum3: " + sum3);
        System.out.println("Time for sequential: " + (seqEnd - seqStart));
        System.out.println("Time for parallel: " + (paraEnd - paraStart));

    }
}
