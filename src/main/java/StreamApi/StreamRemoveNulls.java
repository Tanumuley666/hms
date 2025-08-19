package StreamApi;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamRemoveNulls {
    public static void main(String[] args) {
        List<String> words = List.of("Java",null,"Spring","Hibernate", null ,"Micriservices");

        List<String> noNullWords = words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(noNullWords);
    }
}
