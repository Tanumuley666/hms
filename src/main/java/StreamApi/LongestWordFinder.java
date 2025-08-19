package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentense = "Stream API makes Java coding efficeint";

        Optional<String> longestWord = Arrays.stream(sentense.split(" "))
                .max(Comparator.comparingInt(String::length));

        longestWord.ifPresent(System.out::println);
    }
}
