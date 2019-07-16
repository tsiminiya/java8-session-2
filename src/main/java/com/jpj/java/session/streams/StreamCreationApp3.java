package com.jpj.java.session.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamCreationApp3 {

    public static void main(String[] agrs) {
        // Stream of Primitives
        //IntStream, LongStream, DoubleStream

        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(value -> System.out.print(value + " "));
    }

}
