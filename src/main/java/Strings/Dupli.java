package Strings;

import java.util.stream.Collectors;

public class Dupli {
    public static void main(String[] args) {
        String str = "programming";
        str.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(e-> System.out.println(e.getKey() + " = " + e.getValue()));


    }
}
