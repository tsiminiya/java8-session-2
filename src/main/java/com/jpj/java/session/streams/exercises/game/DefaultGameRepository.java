package com.jpj.java.session.streams.exercises.game;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@AllArgsConstructor
public class DefaultGameRepository implements GameRepository {

    private final GameSource gameSource;

    @Override
    public Game findOne(String id) {
        // TODO: implement this
        return null;
    }

    @Override
    public List<Game> findAll() {
        // TODO: implement this
        return null;
    }

    @Override
    public List<Game> findAll(Predicate<Game> predicate) {
        // TODO: implement this
        return null;
    }

    @Override
    public List<Game> findAll(int page, int pageSize) {
        // TODO: implement this
        return null;
    }

}
