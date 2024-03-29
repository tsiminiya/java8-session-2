package com.jpj.java.session.streams.exercises.game

import spock.lang.Specification

import java.util.function.Function
import java.util.function.Predicate
import java.util.stream.Collectors

class DefaultGameRepositorySpecification extends Specification {

    static Function<Game, String> gameToNameMapper = new Function<Game, String>() {
        @Override
        String apply(Game game) {
            return game.name
        }
    }

    DefaultGameRepository gameRepository
    GameSource gameSource = new DefaultGameSource()

    def setup() {
        gameRepository = new DefaultGameRepository(gameSource)
    }

    def "should return game #name if id is #id"() {
        when:
            Game game = gameRepository.findOne(id)
        then:
            game.name == name
        where:
            id  | name
            '1' | 'Lucky 7'
            '2' | 'Cleopatra'
    }

    def "should return all games"() {
        when:
            List<Game> games = gameRepository.findAll()
            List<String> gameNames = games.stream().map(gameToNameMapper).collect(Collectors.toList())
        then:
            gameNames == ['Lucky 7', 'Cleopatra', 'Baccarat', 'Black Jack', 'Pusoy Dos', 'Pusoy', 'Tongits', 'Poker', 'Dice', 'Lucky 9']
    }

    def "should return games #names if page is #page and page size is #pageSize"() {
        when:
            List<Game> games = gameRepository.findAll(page, pageSize)
            List<String> gameNames = games.stream().map(gameToNameMapper).collect(Collectors.toList())
        then:
            gameNames == expected
        where:
            page | pageSize | expected
            0    | 2        | ['Lucky 7', 'Cleopatra']
            1    | 3        | ['Black Jack', 'Pusoy Dos', 'Pusoy']
    }

    def "should return games that has free trial"() {
        when:
            List<Game> games = gameRepository.findAll(new Predicate<Game>() {
                @Override
                boolean test(Game game) {
                    return game.hasFreeTrial
                }
            })
            List<String> gameNames = games.stream().map(gameToNameMapper).collect(Collectors.toList())
        then:
            gameNames == ['Baccarat', 'Pusoy Dos', 'Pusoy', 'Tongits', 'Poker', 'Dice', 'Lucky 9']
    }

}
