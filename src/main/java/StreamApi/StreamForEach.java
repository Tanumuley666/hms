package StreamApi;

import java.util.List;

public class StreamForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Java","Spring","Hibernate");
        names.stream().forEach(System.out::println);
    }
}
