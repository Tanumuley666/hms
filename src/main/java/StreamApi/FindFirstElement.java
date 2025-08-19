package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ranu", "Raju","Shitu");

        Optional<String> firstName = names.stream().findFirst();
        firstName.ifPresent(System.out::println);

    }
}
