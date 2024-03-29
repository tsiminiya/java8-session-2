package com.jpj.java.session.streams.exercises.numbers;

import lombok.AllArgsConstructor;
import lombok.Data;

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
        return Stream.iterate(new IndexValue(1, 0), (iv) -> new IndexValue(iv.index + 1, computeFibonacci(iv.index))).limit(length)
                .map(iv -> iv.value);
    }

    private static Integer computeFibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return computeFibonacci(number - 1) + computeFibonacci(number - 2);
    }

    @Data
    @AllArgsConstructor
    private static class IndexValue {
        private int index;
        private int value;
    }

}
