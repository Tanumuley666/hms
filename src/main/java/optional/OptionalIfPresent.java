package optional;

import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Bob");
        name.ifPresent(n-> System.out.println("Hello," + n));
    }
}
