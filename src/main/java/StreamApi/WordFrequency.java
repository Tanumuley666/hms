package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList("error", "info", "error", "debug", "info", "error");
         Map<String, Long> frequencyMap = logs.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Log Frequencies: " + frequencyMap);
    }
    }

