package com.jpj.java.session.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationApp {

    public static void main(String[] agrs) {
        Stream<Object> stream1 = Stream.empty();

        Stream<String> stream2 = Stream.of("a", "b", "c");
        stream2.forEach(value -> System.out.print(value + " "));
        System.out.println();

        Stream<String> stream3 = Arrays.stream(new String[] {"d", "e", "f"});
        stream3.forEach(value -> System.out.print(value + " "));
        System.out.println();
        // Stream.of() actually calls Arrays.stream()

        List<String> list = Arrays.asList("g", "h", "i");
        Stream<String> stream4 = list.stream();
        stream4.forEach(value -> System.out.print(value + " "));
    }

}
