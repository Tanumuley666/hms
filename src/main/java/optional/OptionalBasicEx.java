package optional;

import java.util.Optional;

public class OptionalBasicEx {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Ranu");
        System.out.println(name.get());
    }
}
