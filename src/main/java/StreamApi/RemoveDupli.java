package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupli {
    public static void main(String[] args) {
        List<String> names =Arrays.asList("Rani","Rani","Raj","Sham");
        List<String> unuqueNames = names.stream()
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(unuqueNames);
    }
}
