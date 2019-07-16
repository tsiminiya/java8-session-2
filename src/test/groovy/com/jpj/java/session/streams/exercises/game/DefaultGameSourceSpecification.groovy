package com.jpj.java.session.streams.exercises.game

import spock.lang.Specification

import java.util.function.Function
import java.util.stream.Collectors
import java.util.stream.Stream

class DefaultGameSourceSpecification extends Specification {

    DefaultGameSource gameSource = new DefaultGameSource()

    def "should parse game file"() {
        when:
            Stream<Game> gameStream = gameSource.getGamesFromFile()
            List<String> gameNames = gameStream.map(new Function<Game, String>() {
                @Override
                String apply(Game game) {
                    return game.getName()
                }
            }).collect(Collectors.toList())
        then:
            gameNames == ['Lucky 7', 'Cleopatra', 'Baccarat', 'Black Jack', 'Pusoy Dos', 'Pusoy', 'Tongits', 'Poker', 'Dice', 'Lucky 9']
    }

}
