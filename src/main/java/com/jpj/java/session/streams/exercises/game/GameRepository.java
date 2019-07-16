package com.jpj.java.session.streams.exercises.game;

import java.util.List;
import java.util.function.Predicate;

public interface GameRepository {

    Game findOne(String id);

    List<Game> findAll();

    List<Game> findAll(Predicate<Game> predicate);

    List<Game> findAll(int page, int pageSize);

}
