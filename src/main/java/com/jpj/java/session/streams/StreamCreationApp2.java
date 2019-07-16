package com.jpj.java.session.streams;

import java.util.stream.Stream;

public class StreamCreationApp2 {

    public static void main(String[] agrs) {
        Stream<Object> stream1 = Stream.<Object>builder()
                .add("a").add(1.5).add(false).build();
        stream1.forEach(value -> System.out.print(value + " "));
        System.out.println();

        // generate accepts a Supplier as an argument
        Stream<String> stream2 = Stream.generate(() -> "unlimited").limit(10);
        stream2.forEach(value -> System.out.print(value + " "));
        System.out.println();

        // iterate accepts an initial value and a UnaryOperator
        Stream<Integer> stream3 = Stream.iterate(1, (n) -> n + 2).limit(10);
        stream3.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

}
