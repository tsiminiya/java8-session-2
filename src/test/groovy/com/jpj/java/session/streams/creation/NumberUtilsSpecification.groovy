package com.jpj.java.session.streams.creation

import spock.lang.Specification

class NumberUtilsSpecification extends Specification {

    def "should return fibonacci list given a length of #length"() {
        when:
            List<Integer> fibonacciList = NumberUtils.fibonacci(length)
        then:
            fibonacciList == expected
        where:
            length | expected
            3      | [0, 1, 1]
            5      | [0, 1, 1, 2, 3]
    }

}
