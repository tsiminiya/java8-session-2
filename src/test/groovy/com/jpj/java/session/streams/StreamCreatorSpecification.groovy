package com.jpj.java.session.streams

import spock.lang.Specification
import spock.lang.Unroll

import java.util.stream.Collectors

class StreamCreatorSpecification extends Specification {

    @Unroll
    def "should create stream out of arrays"() {
        when:
            def stream = StreamCreator.arrayToStream(strings as String[])
            def result = stream.collect(Collectors.joining(","))
        then:
            result == expected
        where:
            strings                       | expected
            ["apple", "orange", "grapes"] | "apple,orange,grapes"
            ["apple", "pineapple", "pen"] | "apple,pineapple,pen"
    }

}
