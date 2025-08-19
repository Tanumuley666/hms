package optional;

import java.util.Optional;

public class OptionalOrElseEx {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        String result = name.orElse("Default Name");
        System.out.println(result);
    }
}
