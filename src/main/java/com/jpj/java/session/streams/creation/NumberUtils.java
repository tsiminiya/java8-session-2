package com.jpj.java.session.streams.creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberUtils {

    protected NumberUtils() {
        throw new UnsupportedOperationException();
    }

    public static List<Integer> fibonacci(int length) {
        Stream<Integer> fibonacciStream = generateFibonacci(length);
        return fibonacciStream.collect(Collectors.toList());
    }

    private static Stream<Integer> generateFibonacci(int length) {
        // TODO: implement this method
        return Stream.empty();
    }

}
