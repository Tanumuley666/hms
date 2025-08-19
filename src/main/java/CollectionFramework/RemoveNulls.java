package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNulls {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", null, "", "Alice", "Bob", "");

        List<String> filtered = names.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);

    }
}
