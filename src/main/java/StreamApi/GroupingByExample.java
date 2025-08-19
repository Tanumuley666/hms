package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Banan","Cherry","Avocado","Blueberry");

        Map<Character, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(groupedWords);
    }
}
