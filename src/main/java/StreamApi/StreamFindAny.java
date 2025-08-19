package StreamApi;

import java.util.List;
import java.util.Optional;

public class StreamFindAny {
    public static void main(String[] args) {
        List<String> names = List.of("alice","bob","charlie");

        Optional<String> anyName = names.stream().findAny();

        anyName.ifPresent(System.out::println);
    }
}
