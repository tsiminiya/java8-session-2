package com.jpj.java.session.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationApp4 {

    public static void main(String[] agrs) throws IOException {
        // Stream of String
        IntStream streamOfChars = "abc".chars();
        streamOfChars.forEach(ch -> System.out.print(ch + " "));
        System.out.println();

        Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c");
        streamOfString.forEach(str -> System.out.print(str + " "));
        System.out.println();

        // Stream of File
        Path path = Paths.get("files.txt");
        Stream<String> streamOfString2 = Files.lines(path);
        streamOfString2.forEach(str -> System.out.print(str + " "));
    }

}
