import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Lakshman", "Ravan", "Bharat", "Sita");

        Optional<String> firstName = names.stream()
                .filter(str -> str.contains("R"))
                .findFirst();

        System.out.println(firstName.orElse("Not Found"));
    }
}