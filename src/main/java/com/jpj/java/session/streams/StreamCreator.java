package com.jpj.java.session.streams;

import java.util.stream.Stream;

public class StreamCreator {

    protected StreamCreator() {
        throw new UnsupportedOperationException();
    }

    public static Stream<String> arrayToStream(String... strings) {
        if (strings == null) {
            return Stream.empty();
        }
        return Stream.of(strings);
    }

}
