package com.ivan.learning.ocp.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> lolo = new ArrayList<>();
        lolo.add("One");
        lolo.add("Two");
        lolo.add("Three");

        List<Integer> collect = lolo.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(collect);

        Stream<String> s = Stream.of("monkey", "aaa", "ape", "bonobo");
        Optional<String> min = s.min(Comparator.comparingInt(String::length));
        min.ifPresent(System.out::println); // aaa


        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Optional<String> word = stream.reduce(String::concat);
        word.ifPresent(System.out::println);
    }

}
