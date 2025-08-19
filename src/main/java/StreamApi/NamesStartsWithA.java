package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class NamesStartsWithA {
    public static void main(String[] args) {
        List<String> names = List.of("Alice","Bob","Adam","Charlie");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
