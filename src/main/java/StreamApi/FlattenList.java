package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java","Python"),
                Arrays.asList("Spring", "Django"),
                Arrays.asList("React","Angular")

        );
        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("Flattened List: " + flatList);
    }
}
