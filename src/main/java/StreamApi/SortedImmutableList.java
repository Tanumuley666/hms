package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedImmutableList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Swayan","Amit","Neha", "Zara");

        List<String> sortedImmutable = names.stream()
                .sorted()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        System.out.println("Sorted Immutable List: " + sortedImmutable);

    }
}
