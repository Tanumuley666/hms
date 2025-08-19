package optional;

import java.util.Optional;

public class FilterEx {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Eve");

        name.filter(n-> n.startsWith("E"))
                .ifPresent(n-> System.out.println("name starts with E"));

        name.filter(n-> n.startsWith("A"))

                .ifPresent(n -> System.out.println("name starts with A"));
    }
}
