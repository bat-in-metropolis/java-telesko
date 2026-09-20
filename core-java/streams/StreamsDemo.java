import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 2, 4, 1, 6, 3);

        // Similar to JS Array.filter() and Array.map(), but a Stream pipeline is lazy:
        // intermediate operations run only when a terminal operation asks for a result.
        List<Integer> evenSquares = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .sorted()
                .collect(Collectors.toList());

        // reduce(identity, operation) combines the stream into one value.
        int total = evenSquares.stream()
                .reduce(0, (currentTotal, number) -> currentTotal + number);

        System.out.println("original list: " + numbers);
        System.out.println("sorted even squares: " + evenSquares);
        System.out.println("total: " + total);

        // A stream is single-use. Create a new stream for another pipeline.
        long valuesAboveFour = numbers.stream()
                .filter(number -> number > 4)
                .count();

        System.out.println("values above four: " + valuesAboveFour);
    }
}
