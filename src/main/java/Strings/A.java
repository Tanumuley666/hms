package Strings;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class A {


        public static void main(String[] args) {
            List<String> items = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

            Map<String,Long>frequencyMap = items.stream()
                    .collect(Collectors.groupingBy
                            (item -> item,
                                    Collectors.counting()));
            frequencyMap.forEach((item,count)
                    -> System.out.println(item + ":" + count));


        }
    }
