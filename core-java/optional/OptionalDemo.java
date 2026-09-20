import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Lakshman", "Ravan", "Bharat", "Sita");

        // findFirst() returns Optional because the filter might match nothing.
        // Optional makes the missing-value case explicit instead of returning raw null.
        Optional<String> firstName = names.stream()
                .filter(str -> str.contains("R"))
                .findFirst();

        System.out.println(firstName.orElse("Not Found"));

        Optional<String> missingName = names.stream()
                .filter(name -> name.startsWith("Z"))
                .findFirst();

        System.out.println(missingName.orElse("Not Found"));
    }
}
